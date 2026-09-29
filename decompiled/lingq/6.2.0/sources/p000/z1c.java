package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z1c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f70763a = new C0282a(-1232516724, false, new ud1(19));

    /* JADX INFO: renamed from: b */
    public static p04 f70764b;

    /* JADX INFO: renamed from: a */
    public static final p04 m25402a() {
        p04 p04Var = f70764b;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q57(8.0f, 6.82f));
        arrayList.add(new c67(10.36f));
        arrayList.add(new v57(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
        arrayList.add(new x57(8.14f, -5.18f));
        arrayList.add(new v57(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
        arrayList.add(new p57(9.54f, 5.98f));
        arrayList.add(new n57(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
        arrayList.add(m57.f50613c);
        o04.m17720a(o04Var, arrayList, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f70764b = p04VarM17721b;
        return p04VarM17721b;
    }
}
