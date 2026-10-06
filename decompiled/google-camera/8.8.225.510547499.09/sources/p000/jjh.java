package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jjh implements jjm {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34166a;

    public jjh(int i) {
        this.f34166a = i;
    }

    @Override // p000.jjm
    /* JADX INFO: renamed from: a */
    public final jjl mo13309a(Context context, String str, jjk jjkVar) {
        int iMo13308b;
        switch (this.f34166a) {
            case 0:
                jjl jjlVar = new jjl();
                int iMo13307a = jjkVar.mo13307a(context, str);
                jjlVar.f34168a = iMo13307a;
                int i = 0;
                if (iMo13307a != 0) {
                    iMo13308b = jjkVar.mo13308b(context, str, false);
                    jjlVar.f34169b = iMo13308b;
                } else {
                    iMo13308b = jjkVar.mo13308b(context, str, true);
                    jjlVar.f34169b = iMo13308b;
                }
                int i2 = jjlVar.f34168a;
                if (i2 == 0) {
                    if (iMo13308b == 0) {
                        jjlVar.f34170c = 0;
                    }
                    return jjlVar;
                }
                i = i2;
                if (i >= iMo13308b) {
                    jjlVar.f34170c = -1;
                } else {
                    jjlVar.f34170c = 1;
                }
                return jjlVar;
            default:
                jjl jjlVar2 = new jjl();
                int iMo13308b2 = jjkVar.mo13308b(context, str, true);
                jjlVar2.f34169b = iMo13308b2;
                if (iMo13308b2 != 0) {
                    jjlVar2.f34170c = 1;
                } else {
                    int iMo13307a2 = jjkVar.mo13307a(context, str);
                    jjlVar2.f34168a = iMo13307a2;
                    if (iMo13307a2 != 0) {
                        jjlVar2.f34170c = -1;
                    }
                }
                return jjlVar2;
        }
    }
}
