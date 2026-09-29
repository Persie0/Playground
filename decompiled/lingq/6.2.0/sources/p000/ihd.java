package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ihd {

    /* JADX INFO: renamed from: a */
    public static p04 f44128a;

    /* JADX INFO: renamed from: a */
    public static final p04 m13932a() {
        p04 p04Var = f44128a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q57(8.59f, 16.59f));
        arrayList.add(new p57(13.17f, 12.0f));
        arrayList.add(new p57(8.59f, 7.41f));
        arrayList.add(new p57(10.0f, 6.0f));
        arrayList.add(new x57(6.0f, 6.0f));
        arrayList.add(new x57(-6.0f, 6.0f));
        arrayList.add(new x57(-1.41f, -1.41f));
        arrayList.add(m57.f50613c);
        o04.m17720a(o04Var, arrayList, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f44128a = p04VarM17721b;
        return p04VarM17721b;
    }
}
