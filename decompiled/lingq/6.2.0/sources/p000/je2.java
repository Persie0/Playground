package p000;

/* JADX INFO: loaded from: classes.dex */
public final class je2 {

    /* JADX INFO: renamed from: a */
    public final C3436ou f45455a;

    /* JADX INFO: renamed from: b */
    public final p68 f45456b;

    /* JADX INFO: renamed from: c */
    public final op7 f45457c;

    /* JADX INFO: renamed from: d */
    public final em6 f45458d;

    /* JADX INFO: renamed from: e */
    public final y58 f45459e;

    /* JADX INFO: renamed from: f */
    public final x16 f45460f;

    /* JADX INFO: renamed from: g */
    public final x58 f45461g;

    /* JADX INFO: renamed from: h */
    public final z25 f45462h;

    /* JADX INFO: renamed from: i */
    public final h68 f45463i;

    public je2(C3436ou c3436ou, p68 p68Var, op7 op7Var, em6 em6Var, y58 y58Var, x16 x16Var, x58 x58Var, z25 z25Var, h68 h68Var) {
        this.f45455a = c3436ou;
        this.f45456b = p68Var;
        this.f45457c = op7Var;
        this.f45458d = em6Var;
        this.f45459e = y58Var;
        this.f45460f = x16Var;
        this.f45461g = x58Var;
        this.f45462h = z25Var;
        this.f45463i = h68Var;
    }

    /* JADX INFO: renamed from: a */
    public static je2 m14414a(je2 je2Var, C3436ou c3436ou, p68 p68Var, op7 op7Var, em6 em6Var, y58 y58Var, x16 x16Var, x58 x58Var, z25 z25Var, h68 h68Var, int i) {
        if ((i & 1) != 0) {
            c3436ou = je2Var.f45455a;
        }
        C3436ou c3436ou2 = c3436ou;
        if ((i & 2) != 0) {
            p68Var = je2Var.f45456b;
        }
        p68 p68Var2 = p68Var;
        if ((i & 4) != 0) {
            op7Var = je2Var.f45457c;
        }
        op7 op7Var2 = op7Var;
        if ((i & 8) != 0) {
            em6Var = je2Var.f45458d;
        }
        em6 em6Var2 = em6Var;
        if ((i & 16) != 0) {
            y58Var = je2Var.f45459e;
        }
        y58 y58Var2 = y58Var;
        x16 x16Var2 = (i & 32) != 0 ? je2Var.f45460f : x16Var;
        x58 x58Var2 = (i & 64) != 0 ? je2Var.f45461g : x58Var;
        z25 z25Var2 = (i & 128) != 0 ? je2Var.f45462h : z25Var;
        h68 h68Var2 = (i & 256) != 0 ? je2Var.f45463i : h68Var;
        je2Var.getClass();
        h68Var2.getClass();
        return new je2(c3436ou2, p68Var2, op7Var2, em6Var2, y58Var2, x16Var2, x58Var2, z25Var2, h68Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je2)) {
            return false;
        }
        je2 je2Var = (je2) obj;
        return this.f45455a.equals(je2Var.f45455a) && this.f45456b.equals(je2Var.f45456b) && this.f45457c.equals(je2Var.f45457c) && this.f45458d.equals(je2Var.f45458d) && this.f45459e.equals(je2Var.f45459e) && this.f45460f.equals(je2Var.f45460f) && this.f45461g.equals(je2Var.f45461g) && this.f45462h.equals(je2Var.f45462h) && this.f45463i.equals(je2Var.f45463i);
    }

    public final int hashCode() {
        return this.f45463i.hashCode() + ((this.f45462h.hashCode() + ((this.f45461g.hashCode() + ((this.f45460f.hashCode() + ((this.f45459e.hashCode() + ((this.f45458d.hashCode() + ((this.f45457c.hashCode() + ((this.f45456b.hashCode() + (this.f45455a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DialogsState(archiveConfirmationDialog=" + this.f45455a + ", reportDialog=" + this.f45456b + ", purchaseConfirmationDialog=" + this.f45457c + ", notEnoughBalanceDialog=" + this.f45458d + ", removePaidLessonWarningDialog=" + this.f45459e + ", monthlyChallengesDialogState=" + this.f45460f + ", removeLessonWarningDialogState=" + this.f45461g + ", lessonInfoBottomSheet=" + this.f45462h + ", streakRepairDialogState=" + this.f45463i + ")";
    }
}
