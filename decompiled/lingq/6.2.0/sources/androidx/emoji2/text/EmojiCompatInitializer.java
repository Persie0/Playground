package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC3572sf;
import p000.C3002fi;
import p000.C3309ls;
import p000.c54;
import p000.jb3;
import p000.pq2;
import p000.qq2;
import p000.ub5;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements c54 {
    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        Object objM16511l;
        jb3 jb3Var = new jb3(new C3002fi(context, 5));
        jb3Var.f49997a = 1;
        if (pq2.f56647k == null) {
            synchronized (pq2.f56646j) {
                try {
                    if (pq2.f56647k == null) {
                        pq2.f56647k = new pq2(jb3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3309ls c3309lsM16482v = C3309ls.m16482v(context);
        c3309lsM16482v.getClass();
        synchronized (C3309ls.f50056f) {
            try {
                objM16511l = ((HashMap) c3309lsM16482v.f50064b).get(ProcessLifecycleInitializer.class);
                if (objM16511l == null) {
                    objM16511l = c3309lsM16482v.m16511l(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC3572sf abstractC3572sfMo256K = ((ub5) objM16511l).mo256K();
        abstractC3572sfMo256K.mo21323g(new qq2(this, abstractC3572sfMo256K));
        return Boolean.TRUE;
    }
}
