<template>
    <div class="main-content">
        <div style="width: 70%; margin: 20px auto">
            <div style="color: #8b4513; font-size: 16px; font-weight: 550">这里是失物广场，失主一定很急，如果您看到了，请及时联系失主哦！</div>
            <div style="margin-top: 30px">
                <el-input placeholder="请输入物品名称查询" style="width: 200px" v-model="name" size="mini"></el-input>
                <el-button type="info" plain style="margin-left: 10px" @click="load(1)" size="mini">查询</el-button>
                <el-button type="warning" plain style="margin-left: 10px" @click="reset" size="mini">重置</el-button>
            </div>
            <div style="margin-top: 30px">
                <el-row :gutter="20">
                    <el-col :span="6" v-for="item in lostData" style="margin-bottom: 20px">
                        <div class="transition card">
                            <div style="display: flex">
                                <img :src="item.img" alt="" style="height: 75px; width: 75px; border: 1px solid #eeeeee; border-radius: 10px">
                                <div style="margin-left: 10px">
                                    <div style="font-weight: 550; color: #ef5d26">{{ item.name }}</div>
                                    <div style="margin-top: 10px; color: #666666">发布人：{{ item.userName }}</div>
                                    <div style="margin-top: 5px; color: #666666">时间：{{ item.time }}</div>
                                </div>
                            </div>
                            <div style="margin-top: 20px">
                                <el-button type="info" size="mini" @click="viewContent(item.content)">查看详情</el-button>
                                <el-button type="success" size="mini">联系失主</el-button>
                            </div>
                        </div>
                    </el-col>
                </el-row>
            </div>
            <div class="pagination">
                <el-pagination
                        background
                        @current-change="handleCurrentChange"
                        :current-page="pageNum"
                        :page-sizes="[5, 10, 20]"
                        :page-size="pageSize"
                        layout="total, prev, pager, next"
                        :total="total">
                </el-pagination>
            </div>
        </div>
        <el-dialog title="详细信息" :visible.sync="viewVisible" width="55%" :close-on-click-modal="false" destroy-on-close>
            <div v-html="viewData" class="w-e-text w-e-text-container"></div>
        </el-dialog>
    </div>
</template>

<script>
    import E from 'wangeditor'
    export default {

        data() {
            return {
                name: null,
                pageNum: 1,
                pageSize: 8,
                total: 0,
                lostData: [],
                viewVisible: false,
                viewData: null,

            }
        },
        mounted() {
            this.load(1)
        },
        // methods：本页面所有的点击事件或者其他函数定义区
        methods: {
            load(pageNum) {
                if (pageNum) this.pageNum = pageNum
                this.$request.get('/lost/selectPage', {
                    params: {
                        pageNum: this.pageNum,
                        pageSize: this.pageSize,
                        name: this.name,
                    }
                }).then(res => {
                    this.lostData = res.data?.list
                    this.total = res.data?.total
                })
            },
            handleCurrentChange(pageNum) {
                this.pageNum = pageNum
                this.load(this.pageNum)
            },
            reset() {
                this.name = null
                this.load(1)
            },
            viewContent(content) {
                this.viewData = content
                this.viewVisible = true
            }
        }
    }
</script>