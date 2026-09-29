package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import p000.C3386nv;
import p000.bxc;
import p000.kj3;
import p000.nr9;
import p000.on9;
import p000.pl1;
import p000.sed;
import p000.t9a;
import p000.t9d;
import p000.twc;
import p000.uxc;
import p000.xwc;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0964h implements on9 {

    /* JADX INFO: renamed from: a */
    public final String f11856a;

    /* JADX INFO: renamed from: b */
    public final pl1 f11857b;

    /* JADX INFO: renamed from: c */
    public volatile int f11858c = -1;

    /* JADX INFO: renamed from: d */
    public nr9 f11859d;

    public AbstractC0964h(String str, pl1 pl1Var) {
        this.f11856a = str;
        this.f11857b = pl1Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5410a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo5411b(String str);

    /* JADX INFO: renamed from: c */
    public abstract Object mo5412c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract Object mo5413d();

    /* JADX INFO: renamed from: e */
    public abstract void mo5414e(Object obj);

    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:30:0x0093, B:32:0x0097, B:36:0x00ac, B:38:0x00b8, B:40:0x00ca, B:44:0x00e0, B:49:0x00f4, B:50:0x00fa, B:52:0x010a, B:54:0x0112, B:55:0x0124, B:58:0x0137, B:62:0x0148, B:67:0x0153, B:69:0x0159, B:70:0x015e, B:61:0x013d, B:47:0x00e6, B:72:0x0160), top: B:94:0x0093, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:30:0x0093, B:32:0x0097, B:36:0x00ac, B:38:0x00b8, B:40:0x00ca, B:44:0x00e0, B:49:0x00f4, B:50:0x00fa, B:52:0x010a, B:54:0x0112, B:55:0x0124, B:58:0x0137, B:62:0x0148, B:67:0x0153, B:69:0x0159, B:70:0x015e, B:61:0x013d, B:47:0x00e6, B:72:0x0160), top: B:94:0x0093, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0159 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:30:0x0093, B:32:0x0097, B:36:0x00ac, B:38:0x00b8, B:40:0x00ca, B:44:0x00e0, B:49:0x00f4, B:50:0x00fa, B:52:0x010a, B:54:0x0112, B:55:0x0124, B:58:0x0137, B:62:0x0148, B:67:0x0153, B:69:0x0159, B:70:0x015e, B:61:0x013d, B:47:0x00e6, B:72:0x0160), top: B:94:0x0093, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.on9
    public final Object get() {
        t9d t9dVarM19384a;
        Object objMo5410a;
        String str;
        Object obj;
        String strM22330a;
        C0962f c0962f;
        if (AbstractC0963g.f11855c == null) {
            Object obj2 = C0962f.f11840j;
            AbstractC0963g.f11855c = new zzlr();
        }
        Context context = (Context) C0962f.f11841k.get();
        Object objMo5412c = null;
        if (context == null) {
            synchronized (AbstractC0963g.f11853a) {
            }
            C3386nv.m17633t("Must call PhenotypeContext.setContext() first");
            return null;
        }
        C0962f c0962f2 = C0962f.f11842l;
        if (c0962f2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (C0962f.f11840j) {
                    try {
                        if (C0962f.f11842l != null) {
                            c0962f = C0962f.f11842l;
                        } else {
                            c0962f = (C0962f) Optional.m6262a().mo6260e(new uxc(applicationContext, 0));
                            C0962f.f11842l = c0962f;
                            t9a.m21916f(Level.CONFIG, c0962f.m5409a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        c0962f2 = c0962f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.f11858c;
        if (i == -1 || i < ((AtomicInteger) this.f11859d.f53173a).get()) {
            synchronized (this) {
                try {
                    int i2 = this.f11858c;
                    if (i2 == -1) {
                        C0962f.m5408b();
                        c0962f2.getClass();
                        t9dVarM19384a = this.f11857b.m19384a(c0962f2);
                        this.f11859d = t9dVarM19384a.f62034g;
                    } else {
                        t9dVarM19384a = null;
                    }
                    int i3 = ((AtomicInteger) this.f11859d.f53173a).get();
                    if (i2 < i3) {
                        C0962f.m5408b();
                        c0962f2.getClass();
                        Optional optionalM24771i0 = xwc.m24771i0(c0962f2.f11845b);
                        if (!optionalM24771i0.mo6259c() || (strM22330a = ((twc) optionalM24771i0.mo6258b()).m22330a(bxc.m4222a(), this.f11856a)) == null) {
                            objMo5410a = null;
                            if (t9dVarM19384a == null) {
                                t9dVarM19384a = this.f11857b.m19384a(c0962f2);
                            }
                            str = t9dVarM19384a.f62030c;
                            if (!c0962f2.f11845b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                sed.m21322b(c0962f2.m5409a().m4285a(new kj3(23, c0962f2, str)));
                            }
                            obj = ((ImmutableMap) t9dVarM19384a.m21918a().f55940d).get(this.f11856a);
                            if (obj != null) {
                                try {
                                    objMo5412c = mo5412c(obj);
                                } catch (IOException | ClassCastException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f11856a), e);
                                }
                            }
                            if (true == optionalM24771i0.mo6259c()) {
                                objMo5410a = objMo5412c;
                            }
                            if (objMo5410a == null) {
                                objMo5410a = mo5410a();
                            }
                            if (objMo5410a != null) {
                                mo5414e(objMo5410a);
                                this.f11858c = i3;
                            }
                        } else {
                            try {
                                objMo5410a = mo5411b(strM22330a);
                            } catch (IOException | IllegalArgumentException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f11856a), e2);
                                objMo5410a = null;
                            }
                            if (t9dVarM19384a == null) {
                                t9dVarM19384a = this.f11857b.m19384a(c0962f2);
                            }
                            str = t9dVarM19384a.f62030c;
                            if (!c0962f2.f11845b.getPackageName().equals("com.android.vending")) {
                                sed.m21322b(c0962f2.m5409a().m4285a(new kj3(23, c0962f2, str)));
                            }
                            obj = ((ImmutableMap) t9dVarM19384a.m21918a().f55940d).get(this.f11856a);
                            if (obj != null) {
                                objMo5412c = mo5412c(obj);
                            }
                            if (true == optionalM24771i0.mo6259c()) {
                                objMo5410a = objMo5412c;
                            }
                            if (objMo5410a == null) {
                                objMo5410a = mo5410a();
                            }
                            if (objMo5410a != null) {
                                mo5414e(objMo5410a);
                                this.f11858c = i3;
                            }
                        }
                    } else {
                        objMo5410a = mo5413d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objMo5410a = mo5413d();
        }
        objMo5410a.getClass();
        return objMo5410a;
    }
}
