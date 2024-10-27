<template>
    <div class="main-content">
        <div style="width: 80%; margin: 0 auto">
            <el-carousel height="300px">
                <el-carousel-item v-for="item in carouselData" :key="item">
                    <img :src="item" alt="" style="width: 100%; height: 300px">
                </el-carousel-item>
            </el-carousel>
            <div style="margin-top: 20px">
                <el-row :gutter="20">
                    <el-col :span="12">
                        <div class="card">
                            <div style="display: flex">
                                <div style="flex: 1; color: #725b04; font-size: 18px; font-weight: 550">最新发布失物</div>
                                <div style="flex: 1; text-align: right; color: #666666">查看更多</div>
                            </div>
                            <div style="margin-top: 40px">
                                <el-row :gutter="20">
                                    <el-col :span="12">
                                        <div class="transition card">
                                            <div style="display: flex">
                                                <img src="@/assets/imgs/logo.png" alt="" style="height: 75px; width: 75px; border: 1px solid #eeeeee; border-radius: 10px">
                                                <div style="margin-left: 10px">
                                                    <div style="font-weight: 550; color: #ef5d26">李宁羽毛球拍</div>
                                                    <div style="margin-top: 10px; color: #666666">发布人：张三</div>
                                                    <div style="margin-top: 5px; color: #666666">时间：2024-01-17</div>
                                                </div>
                                            </div>
                                            <div style="margin-top: 20px">
                                                <el-button type="info" size="mini">查看详情</el-button>
                                                <el-button type="success" size="mini">联系失主</el-button>
                                            </div>
                                        </div>
                                    </el-col>
                                    <el-col :span="12">
                                        <div class="transition card">
                                            <div style="display: flex">
                                                <img src="@/assets/imgs/logo.png" alt="" style="height: 75px; width: 75px; border: 1px solid #eeeeee; border-radius: 10px">
                                                <div style="margin-left: 10px">
                                                    <div style="font-weight: 550; color: #ef5d26">李宁羽毛球拍</div>
                                                    <div style="margin-top: 10px; color: #666666">发布人：张三</div>
                                                    <div style="margin-top: 5px; color: #666666">时间：2024-01-17</div>
                                                </div>
                                            </div>
                                            <div style="margin-top: 20px">
                                                <el-button type="info" size="mini">查看详情</el-button>
                                                <el-button type="success" size="mini">联系失主</el-button>
                                            </div>
                                        </div>
                                    </el-col>
                                </el-row>
                            </div>
                        </div>
                    </el-col>
                    <el-col :span="12">
                        <div class="card">
                            <div style="display: flex">
                                <div style="flex: 1; color: #725b04; font-size: 18px; font-weight: 550">最新发布招领</div>
                                <div style="flex: 1; text-align: right; color: #666666">查看更多</div>
                            </div>
                            <div style="margin-top: 40px">
                                <el-row :gutter="20">
                                    <el-col :span="12">
                                        <div class="transition card">
                                            <div style="display: flex">
                                                <img src="@/assets/imgs/logo.png" alt="" style="height: 75px; width: 75px; border: 1px solid #eeeeee; border-radius: 10px">
                                                <div style="margin-left: 10px">
                                                    <div style="font-weight: 550; color: #ef5d26">李宁羽毛球拍</div>
                                                    <div style="margin-top: 10px; color: #666666">发布人：张三</div>
                                                    <div style="margin-top: 5px; color: #666666">时间：2024-01-17</div>
                                                </div>
                                            </div>
                                            <div style="margin-top: 20px">
                                                <el-button type="info" size="mini">查看详情</el-button>
                                                <el-button type="success" size="mini">联系失主</el-button>
                                            </div>
                                        </div>
                                    </el-col>
                                    <el-col :span="12">
                                        <div class="transition card">
                                            <div style="display: flex">
                                                <img src="@/assets/imgs/logo.png" alt="" style="height: 75px; width: 75px; border: 1px solid #eeeeee; border-radius: 10px">
                                                <div style="margin-left: 10px">
                                                    <div style="font-weight: 550; color: #ef5d26">李宁羽毛球拍</div>
                                                    <div style="margin-top: 10px; color: #666666">发布人：张三</div>
                                                    <div style="margin-top: 5px; color: #666666">时间：2024-01-17</div>
                                                </div>
                                            </div>
                                            <div style="margin-top: 20px">
                                                <el-button type="info" size="mini">查看详情</el-button>
                                                <el-button type="success" size="mini">联系失主</el-button>
                                            </div>
                                        </div>
                                    </el-col>
                                </el-row>
                            </div>
                        </div>
                    </el-col>
                </el-row>
            </div>
        </div>
    </div>
</template>

<script>

    export default {

        data() {
            return {
                carouselData: [
                    require('@/assets/imgs/lun-1.png'),

                ],
            }
        },
        mounted() {

        },
        // methods：本页面所有的点击事件或者其他函数定义区
        methods: {

        }
    }
</script>