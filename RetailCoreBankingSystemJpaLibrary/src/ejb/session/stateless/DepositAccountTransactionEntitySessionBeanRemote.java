/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb.session.stateless;

import entity.DepositAccountTransactionEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author choijiwon
 */
@Remote
public interface DepositAccountTransactionEntitySessionBeanRemote {
    
    public Long createNewDepositAccountTransaction(DepositAccountTransactionEntity newDepositAccountTransaction);
    public List<DepositAccountTransactionEntity> retrieveAllDepositAccountTransaction();
    
}
