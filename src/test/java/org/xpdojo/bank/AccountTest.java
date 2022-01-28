package org.xpdojo.bank;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Disabled;
import static org.xpdojo.bank.Account.emptyAccount;
import static org.assertj.core.api.Assertions


import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	    public void initialAccount_shouldHaveZeroBalance() {
        Acccount account = new emptyAccount();
        assertThat(emptyAccount.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmount_shouldIncreaeBalanceBySameAmount(){
        Acccount account = new emptyAccount();
        account.deposit(amount 10);
        assertThat(emptyAccount.balance()).isEqualTo(10)
    }

    @Test
    public void depositAnAmount_shouldIncreaeBalanceByBothAmount(){
        Acccount account = new emptyAccount();
        account.deposit(amount 10);
        account.deposit(amount 20);
        assertThat(emptyAccount.balance()).isEqualTo(30)
    }
}
