package nc.util;

public class PASql {


    public static String querryexecuter(String userid) {
        if (userid.equalsIgnoreCase("cm")) {
            String cm = "select TOP 1 cs.paid from PA.CertificationStatus cs join PA p on p.paid=cs.paid join Account.[user] u on u.userid=p.userid JOIN PAContact con on con.paid=cs.paid and con.ObsoleteTime IS NULL where CertificationProductID=1 and u.LastLoginOn < GETDATE()-365 and PAStatusID=1 and con.BadEmail=0 and con.BadAddress=0 AND U.[FailedLoginAttemptCount] = 0 and u.PasswordSalt = 0x9046FDE43DCD3227 AND u.PasswordRequirementsMet = 1 and cs.paid not in (select paid from Application where CreateDate > DateAdd(YEAR,-1,'01-01-'+Cast(cs.RecertificationYear as varchar)) and ExamScoreStatusID in (1,0)) and cs.PaId NOT IN (select PaId from Pa.CertificationStatus where CertificationProductId = 11) order by newid()";
            //var cm = "select TOP 1 cs.paid from PA.CertificationStatus cs join PA p on p.paid=cs.paid join Account.[user] u on u.userid=p.userid JOIN PAContact con on con.paid=cs.paid and con.ObsoleteTime IS NULL where CertificationProductID=1 and u.LastLoginOn < GETDATE()-365 and PAStatusID=1 and con.BadEmail=0 and con.BadAddress=0 and cs.paid not in (select paid from Application where CreateDate > DateAdd(YEAR,-1,'01-01-'+Cast(cs.RecertificationYear as varchar)) and ExamScoreStatusID in (1,0)) order by newid()"
            //var cm = "SELECT TOP 1 cs.paid from PA.CertificationStatus cs where PaStatusId=1 and cs.paid IS NOT NULL ORDER BY NEWID()"
            return cm;
        }
        else if (userid.equalsIgnoreCase("cr")){
            String cr = "select TOP 1 cs.paid FROM Pa.CertificationStatus cs JOIN Pa p ON p.PAID = cs.PaId JOIN PAContact pc on pc.PAID = cs.PaId JOIN Account.[User] a ON a.UserId = p.UserId WHERE cs.PaStatusId = 2 AND cs.CertificationProductId = 1 AND a.UserName IS NOT NULL AND pc.ObsoleteTime IS NULL AND pc.BadAddress = 0 AND pc.BadEmail = 0 AND a.[FailedLoginAttemptCount] = 0 and a.PasswordSalt = 0x9046FDE43DCD3227 AND a.PasswordRequirementsMet = 1 and cs.PaId NOT IN (select PaId from Pa.CertificationStatus where CertificationProductId = 11) ORDER BY NEWID()";
            //var cr = "select TOP 1 cs.paid FROM Pa.CertificationStatus cs JOIN Pa p ON p.PAID = cs.PaId JOIN PAContact pc on pc.PAID = cs.PaId JOIN Account.[User] a ON a.UserId = p.UserId WHERE cs.PaStatusId = 2 AND cs.CertificationProductId = 1 AND a.UserName IS NOT NULL AND pc.ObsoleteTime IS NULL AND pc.BadAddress = 0 AND pc.BadEmail = 0 ORDER BY NEWID()"
            return cr;
        }
        return " ";
    }
}
