package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nrb {

    /* JADX INFO: renamed from: a */
    public static final nrb f44138a;

    /* JADX INFO: renamed from: b */
    public static final nrb f44139b;

    /* JADX INFO: renamed from: c */
    public static final nrb f44140c;

    /* JADX INFO: renamed from: d */
    public static final nrb f44141d;

    /* JADX INFO: renamed from: e */
    public static final nrb f44142e;

    /* JADX INFO: renamed from: f */
    public static final nrb f44143f;

    /* JADX INFO: renamed from: g */
    public static final nrb f44144g;

    /* JADX INFO: renamed from: h */
    public static final nrb f44145h;

    /* JADX INFO: renamed from: j */
    private static final nrb[] f44146j;

    /* JADX INFO: renamed from: i */
    public final int f44147i;

    /* JADX INFO: renamed from: k */
    private final String f44148k;

    static {
        nrb nrbVar = new nrb("kUnknown", -1);
        f44138a = nrbVar;
        nrb nrbVar2 = new nrb("kInactive", 0);
        f44139b = nrbVar2;
        nrb nrbVar3 = new nrb("kPassiveScan", 1);
        f44140c = nrbVar3;
        nrb nrbVar4 = new nrb("kPassiveFocused", 2);
        f44141d = nrbVar4;
        nrb nrbVar5 = new nrb("kActiveScan", 3);
        f44142e = nrbVar5;
        nrb nrbVar6 = new nrb("kFocusedLocked", 4);
        f44143f = nrbVar6;
        nrb nrbVar7 = new nrb("kNotFocusedLocked", 5);
        f44144g = nrbVar7;
        nrb nrbVar8 = new nrb("kPassiveUnfocused", 6);
        f44145h = nrbVar8;
        f44146j = new nrb[]{nrbVar, nrbVar2, nrbVar3, nrbVar4, nrbVar5, nrbVar6, nrbVar7, nrbVar8};
    }

    private nrb(String str, int i) {
        this.f44148k = str;
        this.f44147i = i;
    }

    /* JADX INFO: renamed from: a */
    public static nrb m17630a(int i) {
        nrb[] nrbVarArr = f44146j;
        int i2 = 0;
        if (i < 8 && i >= 0) {
            nrb nrbVar = nrbVarArr[i];
            if (nrbVar.f44147i == i) {
                return nrbVar;
            }
        }
        while (true) {
            nrb[] nrbVarArr2 = f44146j;
            if (i2 >= 8) {
                throw new IllegalArgumentException("No enum " + nrb.class.toString() + " with value " + i);
            }
            nrb nrbVar2 = nrbVarArr2[i2];
            if (nrbVar2.f44147i == i) {
                return nrbVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44148k;
    }
}
