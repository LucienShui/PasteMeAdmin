package cn.pasteme.admin.risk;

import cn.pasteme.admin.risk.result.RiskResult;

/**
 * 风险控制
 *
 * @author Lucien
 * @version 1.0.0
 *
 */
public interface RiskController {

    /**
     * 评估一篇文本是否有风险
     * @param text 文本
     * @return RiskResult
     */
    RiskResult evaluate(String text);
}
