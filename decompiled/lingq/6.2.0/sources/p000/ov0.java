package p000;

import com.lingq.core.database.entity.LibraryCounterEntity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55024a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f55026c;

    public /* synthetic */ ov0(int i, String str) {
        this.f55025b = i;
        this.f55026c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f55024a;
        String str = this.f55026c;
        int i2 = this.f55025b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM ChatSuggestionEntity WHERE language = ? AND chatId = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2878j(2, i2);
                    ik8VarMo2873e0.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT DISTINCT * FROM LibraryCounterEntity WHERE id = ? AND type = ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "type");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "roseGiven");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "progress");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "listenTimes");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "readTimes");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isTaken");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "difficulty");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "rosesCount");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "newWordsCount");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "knownWordsCount");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsCount");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonsCount");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isCompletelyTaken");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "totalWordsCount");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "uniqueWordsCount");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioStart");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioEnd");
                    Object libraryCounterEntity = null;
                    if (ik8VarMo2873e1.mo2876a0()) {
                        libraryCounterEntity = new LibraryCounterEntity((int) ik8VarMo2873e1.getLong(iM14108v), ik8VarMo2873e1.mo2875L(iM14108v2), ((int) ik8VarMo2873e1.getLong(iM14108v3)) != 0, ik8VarMo2873e1.isNull(iM14108v4) ? null : Float.valueOf((float) ik8VarMo2873e1.getDouble(iM14108v4)), ik8VarMo2873e1.isNull(iM14108v5) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v5)), ik8VarMo2873e1.isNull(iM14108v6) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v6)), ((int) ik8VarMo2873e1.getLong(iM14108v7)) != 0, (float) ik8VarMo2873e1.getDouble(iM14108v8), (int) ik8VarMo2873e1.getLong(iM14108v9), (int) ik8VarMo2873e1.getLong(iM14108v10), (int) ik8VarMo2873e1.getLong(iM14108v11), (int) ik8VarMo2873e1.getLong(iM14108v12), (int) ik8VarMo2873e1.getLong(iM14108v13), ((int) ik8VarMo2873e1.getLong(iM14108v14)) != 0, (int) ik8VarMo2873e1.getLong(iM14108v15), (int) ik8VarMo2873e1.getLong(iM14108v16), ik8VarMo2873e1.isNull(iM14108v17) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v17)), ik8VarMo2873e1.isNull(iM14108v18) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v18)));
                    }
                    return libraryCounterEntity;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }

    public /* synthetic */ ov0(String str, int i) {
        this.f55026c = str;
        this.f55025b = i;
    }
}
