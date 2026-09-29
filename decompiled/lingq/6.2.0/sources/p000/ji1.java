package p000;

import android.database.SQLException;
import androidx.room.coroutines.C0740a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ji1 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f45562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45563c;

    public /* synthetic */ ji1(C0740a c0740a, boolean z) {
        this.f45561a = 0;
        this.f45563c = c0740a;
        this.f45562b = z;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f45561a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f45563c;
        boolean z = this.f45562b;
        switch (i) {
            case 0:
                C0740a c0740a = (C0740a) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                c0740a.f6927b.m2822d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                c0740a.f6926a.m2822d(sb);
                try {
                    AbstractC3695vr.m23485C(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i2 = c0740a.f6932g;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return xfaVar;
                }
            case 1:
                ui3 ui3Var = (ui3) obj;
                if (z) {
                    ui3Var.mo0a();
                }
                return xfaVar;
            default:
                t66 t66Var = (t66) obj;
                if (!z) {
                    t66Var.setValue(null);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ ji1(boolean z, Object obj, int i) {
        this.f45561a = i;
        this.f45562b = z;
        this.f45563c = obj;
    }
}
