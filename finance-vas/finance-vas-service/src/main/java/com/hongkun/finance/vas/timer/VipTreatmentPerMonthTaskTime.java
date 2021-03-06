package com.hongkun.finance.vas.timer;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.hongkun.finance.vas.facade.VasVipTreatmentFacade;
import com.yirun.framework.core.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Description : 每月1号发送卡券
 * @Project : framework
 * @Program Name  : com.hongkun.finance.vas.timer.VipTreatmentPerMonthTaskTime
 * @Author : pengwu@hongkun.com.cn 吴鹏
 */
public class VipTreatmentPerMonthTaskTime implements SimpleJob{

    private static final Logger logger = LoggerFactory.getLogger(VipTreatmentPerBirthDayTaskTime.class);
    @Autowired
    private VasVipTreatmentFacade vasVipTreatmentFacade;

    @Override
    public void execute(ShardingContext shardingContext) {
        Date currentDate = DateUtils.getCurrentDate();
        vasVipTreatmentFacade.vipTreatmentPerMonth(currentDate,shardingContext.getShardingItem());
        logger.info("VipTreatmentPerMonthTaskTime, 每月1号发送卡券, 跑批时间: {}, 分片项处理结束: {}",
                currentDate, shardingContext.getShardingItem());
    }
}
