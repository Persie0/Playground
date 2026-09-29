package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.glance.session.C0698f;
import androidx.glance.state.C0703a;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C0785at;
import p000.C3386nv;
import p000.bj3;
import p000.e99;
import p000.f8a;
import p000.jz8;
import p000.ln3;
import p000.xfa;
import p000.y2d;
import p000.zi7;

/* JADX INFO: renamed from: androidx.glance.appwidget.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0659g {

    /* JADX INFO: renamed from: a */
    public final int f6010a = R$layout.glance_error_layout;

    /* JADX INFO: renamed from: g */
    public static Object m2231g(AbstractC0659g abstractC0659g, Context context, int i, ContinuationImpl continuationImpl) {
        abstractC0659g.getClass();
        f8a.m11599a();
        Object objM2233b = abstractC0659g.m2233b(context, new C0785at(i), null, new GlanceAppWidget$update$4(), continuationImpl);
        return objM2233b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2233b : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        if (r7.m2502a(r1, r4, r9, r0) == r10) goto L54;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2232a(Context context, int i, ContinuationImpl continuationImpl) throws Throwable {
        GlanceAppWidget$deleted$1 glanceAppWidget$deleted$1;
        C0785at c0785at;
        C0785at c0785at2;
        Throwable th;
        Context context2;
        int i2;
        C0785at c0785at3;
        C0785at c0785at4;
        Throwable th2;
        Context context3;
        C0703a c0703a;
        String strM24910a;
        Context context4;
        C0703a c0703a2;
        String strM24910a2;
        Context context5;
        if (continuationImpl instanceof GlanceAppWidget$deleted$1) {
            glanceAppWidget$deleted$1 = (GlanceAppWidget$deleted$1) continuationImpl;
            int i3 = glanceAppWidget$deleted$1.f5854g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                glanceAppWidget$deleted$1.f5854g = i3 - Integer.MIN_VALUE;
            } else {
                glanceAppWidget$deleted$1 = new GlanceAppWidget$deleted$1(this, continuationImpl);
            }
        } else {
            glanceAppWidget$deleted$1 = new GlanceAppWidget$deleted$1(this, continuationImpl);
        }
        Object obj = glanceAppWidget$deleted$1.f5852e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = glanceAppWidget$deleted$1.f5854g;
        xfa xfaVar = xfa.f68157a;
        zi7 zi7Var = zi7.f71615a;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(obj);
                c0785at = new C0785at(i);
                C0698f c0698fM14755a = jz8.m14755a();
                GlanceAppWidget$deleted$2 glanceAppWidget$deleted$2 = new GlanceAppWidget$deleted$2(c0785at, null);
                glanceAppWidget$deleted$1.f5848a = context;
                glanceAppWidget$deleted$1.f5849b = c0785at;
                glanceAppWidget$deleted$1.f5851d = i;
                glanceAppWidget$deleted$1.f5854g = 1;
                if (c0698fM14755a.m2498a(glanceAppWidget$deleted$2, glanceAppWidget$deleted$1) != coroutineSingletons) {
                    try {
                        glanceAppWidget$deleted$1.f5848a = context;
                        glanceAppWidget$deleted$1.f5849b = c0785at;
                        glanceAppWidget$deleted$1.f5851d = i;
                        glanceAppWidget$deleted$1.f5854g = 2;
                        if (xfaVar != coroutineSingletons) {
                            context2 = context;
                            c0785at4 = c0785at;
                            c0703a2 = C0703a.f6305a;
                            strM24910a2 = y2d.m24910a(i);
                            glanceAppWidget$deleted$1.f5848a = context2;
                            glanceAppWidget$deleted$1.f5849b = c0785at4;
                            glanceAppWidget$deleted$1.f5854g = 3;
                            if (c0703a2.m2502a(context2, zi7Var, strM24910a2, glanceAppWidget$deleted$1) != coroutineSingletons) {
                                context5 = context2;
                                C0663k.m2252b(context5, c0785at4);
                                return xfaVar;
                            }
                        }
                    } catch (CancellationException unused) {
                        context2 = context;
                        c0785at3 = c0785at;
                        C0703a c0703a3 = C0703a.f6305a;
                        String strM24910a3 = y2d.m24910a(i);
                        glanceAppWidget$deleted$1.f5848a = context2;
                        glanceAppWidget$deleted$1.f5849b = c0785at3;
                        glanceAppWidget$deleted$1.f5854g = 4;
                        break;
                    } catch (Throwable th3) {
                        int i5 = i;
                        c0785at2 = c0785at;
                        th = th3;
                        context2 = context;
                        i2 = i5;
                        try {
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            c0703a = C0703a.f6305a;
                            strM24910a = y2d.m24910a(i2);
                            glanceAppWidget$deleted$1.f5848a = context2;
                            glanceAppWidget$deleted$1.f5849b = c0785at2;
                            glanceAppWidget$deleted$1.f5854g = 5;
                            if (c0703a.m2502a(context2, zi7Var, strM24910a, glanceAppWidget$deleted$1) != coroutineSingletons) {
                                c0785at3 = c0785at2;
                                context4 = context2;
                                C0663k.m2252b(context4, c0785at3);
                                return xfaVar;
                            }
                        } catch (Throwable th4) {
                            C0703a c0703a4 = C0703a.f6305a;
                            String strM24910a4 = y2d.m24910a(i2);
                            glanceAppWidget$deleted$1.f5848a = context2;
                            glanceAppWidget$deleted$1.f5849b = c0785at2;
                            glanceAppWidget$deleted$1.f5850c = th4;
                            glanceAppWidget$deleted$1.f5854g = 6;
                            if (c0703a4.m2502a(context2, zi7Var, strM24910a4, glanceAppWidget$deleted$1) != coroutineSingletons) {
                                th2 = th4;
                                context3 = context2;
                                C0663k.m2252b(context3, c0785at2);
                                throw th2;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = glanceAppWidget$deleted$1.f5851d;
                C0785at c0785at5 = glanceAppWidget$deleted$1.f5849b;
                Context context6 = glanceAppWidget$deleted$1.f5848a;
                AbstractC3193b.m15359b(obj);
                c0785at = c0785at5;
                context = context6;
                glanceAppWidget$deleted$1.f5848a = context;
                glanceAppWidget$deleted$1.f5849b = c0785at;
                glanceAppWidget$deleted$1.f5851d = i;
                glanceAppWidget$deleted$1.f5854g = 2;
                if (xfaVar != coroutineSingletons) {
                    context2 = context;
                    c0785at4 = c0785at;
                    c0703a2 = C0703a.f6305a;
                    strM24910a2 = y2d.m24910a(i);
                    glanceAppWidget$deleted$1.f5848a = context2;
                    glanceAppWidget$deleted$1.f5849b = c0785at4;
                    glanceAppWidget$deleted$1.f5854g = 3;
                    if (c0703a2.m2502a(context2, zi7Var, strM24910a2, glanceAppWidget$deleted$1) != coroutineSingletons) {
                        context5 = context2;
                        C0663k.m2252b(context5, c0785at4);
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 2:
                i2 = glanceAppWidget$deleted$1.f5851d;
                c0785at2 = glanceAppWidget$deleted$1.f5849b;
                context2 = glanceAppWidget$deleted$1.f5848a;
                try {
                    AbstractC3193b.m15359b(obj);
                    i = i2;
                    c0785at4 = c0785at2;
                    c0703a2 = C0703a.f6305a;
                    strM24910a2 = y2d.m24910a(i);
                    glanceAppWidget$deleted$1.f5848a = context2;
                    glanceAppWidget$deleted$1.f5849b = c0785at4;
                    glanceAppWidget$deleted$1.f5854g = 3;
                    if (c0703a2.m2502a(context2, zi7Var, strM24910a2, glanceAppWidget$deleted$1) != coroutineSingletons) {
                        context5 = context2;
                        C0663k.m2252b(context5, c0785at4);
                        return xfaVar;
                    }
                } catch (CancellationException unused2) {
                    i = i2;
                    c0785at3 = c0785at2;
                    C0703a c0703a5 = C0703a.f6305a;
                    String strM24910a5 = y2d.m24910a(i);
                    glanceAppWidget$deleted$1.f5848a = context2;
                    glanceAppWidget$deleted$1.f5849b = c0785at3;
                    glanceAppWidget$deleted$1.f5854g = 4;
                    break;
                } catch (Throwable th5) {
                    th = th5;
                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                    c0703a = C0703a.f6305a;
                    strM24910a = y2d.m24910a(i2);
                    glanceAppWidget$deleted$1.f5848a = context2;
                    glanceAppWidget$deleted$1.f5849b = c0785at2;
                    glanceAppWidget$deleted$1.f5854g = 5;
                    if (c0703a.m2502a(context2, zi7Var, strM24910a, glanceAppWidget$deleted$1) != coroutineSingletons) {
                        c0785at3 = c0785at2;
                        context4 = context2;
                        C0663k.m2252b(context4, c0785at3);
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 3:
                c0785at4 = glanceAppWidget$deleted$1.f5849b;
                context5 = glanceAppWidget$deleted$1.f5848a;
                AbstractC3193b.m15359b(obj);
                C0663k.m2252b(context5, c0785at4);
                return xfaVar;
            case 4:
            case 5:
                c0785at3 = glanceAppWidget$deleted$1.f5849b;
                context4 = glanceAppWidget$deleted$1.f5848a;
                AbstractC3193b.m15359b(obj);
                C0663k.m2252b(context4, c0785at3);
                return xfaVar;
            case 6:
                th2 = glanceAppWidget$deleted$1.f5850c;
                c0785at2 = glanceAppWidget$deleted$1.f5849b;
                context3 = glanceAppWidget$deleted$1.f5848a;
                AbstractC3193b.m15359b(obj);
                C0663k.m2252b(context3, c0785at2);
                throw th2;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2233b(Context context, C0785at c0785at, Bundle bundle, bj3 bj3Var, ContinuationImpl continuationImpl) {
        return jz8.m14755a().m2498a(new GlanceAppWidget$getOrCreateAppWidgetSession$2(context, c0785at, this, bundle, bj3Var, null), continuationImpl);
    }

    /* JADX INFO: renamed from: c */
    public abstract e99 mo2234c();

    /* JADX INFO: renamed from: d */
    public abstract Object mo2235d(Context context, Continuation continuation);

    /* JADX INFO: renamed from: e */
    public abstract Object mo2236e(Context context, int i, Continuation continuation);

    /* JADX INFO: renamed from: f */
    public final Object m2237f(Context context, ln3 ln3Var, ContinuationImpl continuationImpl) {
        if (ln3Var instanceof C0785at) {
            C0785at c0785at = (C0785at) ln3Var;
            if (y2d.m24915f(c0785at)) {
                Object objM2231g = m2231g(this, context, c0785at.m3025a(), continuationImpl);
                return objM2231g == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2231g : xfa.f68157a;
            }
        }
        C3386nv.m17626m("Invalid Glance ID");
        return null;
    }
}
