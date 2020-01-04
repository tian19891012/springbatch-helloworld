package com.kevin;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/721:06
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {
    public CreditBill process(CreditBill creditBill) throws Exception {
        System.out.println(creditBill.toString());
        return creditBill;
    }
}
