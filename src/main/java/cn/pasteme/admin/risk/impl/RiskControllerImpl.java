package cn.pasteme.admin.risk.impl;

import cn.pasteme.admin.risk.RiskController;

import cn.pasteme.admin.risk.result.RiskResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Lucien
 * @version 1.0.0
 */
@Slf4j
@Service
public class RiskControllerImpl implements RiskController {

    @Override
    public RiskResult evaluate(String text) {
        return RiskResult.NORMAL;
    }
}
