package com.lingq.feature.widget.streak;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.appwidget.AbstractC0652b;
import androidx.glance.appwidget.AbstractC0659g;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.stats.C1529d;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3064h6;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C2990f6;
import p000.C3386nv;
import p000.bk2;
import p000.cma;
import p000.do7;
import p000.e99;
import p000.eq8;
import p000.fk9;
import p000.gid;
import p000.gpb;
import p000.h39;
import p000.j4b;
import p000.ky1;
import p000.si7;
import p000.t3d;
import p000.tg9;
import p000.tj3;
import p000.vi7;
import p000.vk9;
import p000.x18;
import p000.xfa;
import p000.xj2;
import p000.ye1;
import p000.yf1;

/* JADX INFO: renamed from: com.lingq.feature.widget.streak.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2871b extends AbstractC0659g {

    /* JADX INFO: renamed from: b */
    public final e99 f33885b = new e99(AbstractC3550rv.m20855w0(new bk2[]{new bk2(AbstractC3584sr.m21614a(172.0f, 224.0f)), new bk2(AbstractC3584sr.m21614a(360.0f, 224.0f)), new bk2(AbstractC3584sr.m21614a(360.0f, 400.0f))}));

    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: c */
    public final e99 mo2234c() {
        return this.f33885b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (m9793j((android.content.Context) r9, r2, r8, r0) == r1) goto L22;
     */
    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2235d(Context context, Continuation continuation) throws Throwable {
        StreakWidget$provideGlance$1 streakWidget$provideGlance$1;
        ky1 ky1Var;
        if (continuation instanceof StreakWidget$provideGlance$1) {
            streakWidget$provideGlance$1 = (StreakWidget$provideGlance$1) continuation;
            int i = streakWidget$provideGlance$1.f33875d;
            if ((i & Integer.MIN_VALUE) != 0) {
                streakWidget$provideGlance$1.f33875d = i - Integer.MIN_VALUE;
            } else {
                streakWidget$provideGlance$1 = new StreakWidget$provideGlance$1(this, (ContinuationImpl) continuation);
            }
        } else {
            streakWidget$provideGlance$1 = new StreakWidget$provideGlance$1(this, (ContinuationImpl) continuation);
        }
        Object obj = streakWidget$provideGlance$1.f33873b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = streakWidget$provideGlance$1.f33875d;
        if (i2 != 0) {
            if (i2 == 1) {
                ky1Var = streakWidget$provideGlance$1.f33872a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        ky1 ky1Var2 = (ky1) ((j4b) do7.m10537m(context, j4b.class));
        si7 si7Var = (si7) ky1Var2.f48692g.get();
        streakWidget$provideGlance$1.f33872a = ky1Var2;
        streakWidget$provideGlance$1.f33875d = 1;
        Object objM9792i = m9792i(context, si7Var, streakWidget$provideGlance$1);
        if (objM9792i != obj2) {
            obj = objM9792i;
            ky1Var = ky1Var2;
        }
        return obj2;
        cma cmaVar = (cma) ky1Var.f48596D.get();
        C1529d c1529dM15730d = ky1Var.m15730d();
        streakWidget$provideGlance$1.f33872a = null;
        streakWidget$provideGlance$1.f33875d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (m9793j((android.content.Context) r10, r2, r8, r0) == r1) goto L22;
     */
    @Override // androidx.glance.appwidget.AbstractC0659g
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2236e(Context context, int i, Continuation continuation) throws Throwable {
        StreakWidget$providePreview$1 streakWidget$providePreview$1;
        ky1 ky1Var;
        if (continuation instanceof StreakWidget$providePreview$1) {
            streakWidget$providePreview$1 = (StreakWidget$providePreview$1) continuation;
            int i2 = streakWidget$providePreview$1.f33880e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                streakWidget$providePreview$1.f33880e = i2 - Integer.MIN_VALUE;
            } else {
                streakWidget$providePreview$1 = new StreakWidget$providePreview$1(this, (ContinuationImpl) continuation);
            }
        } else {
            streakWidget$providePreview$1 = new StreakWidget$providePreview$1(this, (ContinuationImpl) continuation);
        }
        Object obj = streakWidget$providePreview$1.f33878c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = streakWidget$providePreview$1.f33880e;
        if (i3 != 0) {
            if (i3 == 1) {
                i = streakWidget$providePreview$1.f33877b;
                ky1Var = streakWidget$providePreview$1.f33876a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        ky1 ky1Var2 = (ky1) ((j4b) do7.m10537m(context, j4b.class));
        si7 si7Var = (si7) ky1Var2.f48692g.get();
        streakWidget$providePreview$1.f33876a = ky1Var2;
        streakWidget$providePreview$1.f33877b = i;
        streakWidget$providePreview$1.f33880e = 1;
        Object objM9792i = m9792i(context, si7Var, streakWidget$providePreview$1);
        if (objM9792i != obj2) {
            obj = objM9792i;
            ky1Var = ky1Var2;
        }
        return obj2;
        cma cmaVar = (cma) ky1Var.f48596D.get();
        C1529d c1529dM15730d = ky1Var.m15730d();
        streakWidget$providePreview$1.f33876a = null;
        streakWidget$providePreview$1.f33877b = i;
        streakWidget$providePreview$1.f33880e = 2;
    }

    /* JADX INFO: renamed from: h */
    public final void m9791h(fk9 fk9Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(735142950);
        int i2 = (tj3Var.m22124i(fk9Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            long j = ((bk2) tj3Var.m22128k(yf1.f69762a)).f8632a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.lingq.com/library"));
            intent.setPackage("com.linguist");
            intent.setFlags(268468224);
            tg9 tg9Var = new tg9(intent, AbstractC3064h6.m13073a((C2990f6[]) Arrays.copyOf(new C2990f6[0], 0)));
            if (xj2.m24559a(bk2.m3806b(j), 250.0f) < 0) {
                tj3Var.m22111b0(2097744852);
                t3d.m21835a(fk9Var, tg9Var, tj3Var, i2 & 14);
                tj3Var.m22139q(false);
            } else if (xj2.m24559a(bk2.m3805a(j), 280.0f) >= 0) {
                tj3Var.m22111b0(2097749620);
                gid.m12674a(fk9Var, tg9Var, tj3Var, i2 & 14);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2097753845);
                gpb.m12794a(fk9Var, tg9Var, tj3Var, i2 & 14);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(this, i, 15, fk9Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m9792i(Context context, si7 si7Var, ContinuationImpl continuationImpl) throws Throwable {
        StreakWidget$createLocalizedContext$1 streakWidget$createLocalizedContext$1;
        if (continuationImpl instanceof StreakWidget$createLocalizedContext$1) {
            streakWidget$createLocalizedContext$1 = (StreakWidget$createLocalizedContext$1) continuationImpl;
            int i = streakWidget$createLocalizedContext$1.f33871d;
            if ((i & Integer.MIN_VALUE) != 0) {
                streakWidget$createLocalizedContext$1.f33871d = i - Integer.MIN_VALUE;
            } else {
                streakWidget$createLocalizedContext$1 = new StreakWidget$createLocalizedContext$1(this, continuationImpl);
            }
        } else {
            streakWidget$createLocalizedContext$1 = new StreakWidget$createLocalizedContext$1(this, continuationImpl);
        }
        Object objM15541t = streakWidget$createLocalizedContext$1.f33869b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = streakWidget$createLocalizedContext$1.f33871d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            vi7 vi7Var = ((C1368a) si7Var).f18356L0;
            streakWidget$createLocalizedContext$1.f33868a = context;
            streakWidget$createLocalizedContext$1.f33871d = 1;
            objM15541t = AbstractC3224d.m15541t(vi7Var, streakWidget$createLocalizedContext$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = streakWidget$createLocalizedContext$1.f33868a;
            AbstractC3193b.m15359b(objM15541t);
        }
        String str = (String) objM15541t;
        if (vk9.m23391n0(str)) {
            return context;
        }
        String strReplace = str.replace('_', '-');
        strReplace.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(strReplace);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeForLanguageTag);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final CoroutineSingletons m9793j(Context context, cma cmaVar, C1529d c1529d, ContinuationImpl continuationImpl) throws Throwable {
        StreakWidget$widgetContent$1 streakWidget$widgetContent$1;
        if (continuationImpl instanceof StreakWidget$widgetContent$1) {
            streakWidget$widgetContent$1 = (StreakWidget$widgetContent$1) continuationImpl;
            int i = streakWidget$widgetContent$1.f33883c;
            if ((i & Integer.MIN_VALUE) != 0) {
                streakWidget$widgetContent$1.f33883c = i - Integer.MIN_VALUE;
            } else {
                streakWidget$widgetContent$1 = new StreakWidget$widgetContent$1(this, continuationImpl);
            }
        } else {
            streakWidget$widgetContent$1 = new StreakWidget$widgetContent$1(this, continuationImpl);
        }
        Object obj = streakWidget$widgetContent$1.f33881a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = streakWidget$widgetContent$1.f33883c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C0282a c0282a = new C0282a(8182570, true, new h39(context, cmaVar, c1529d, this, 3));
            streakWidget$widgetContent$1.f33883c = 1;
            if (AbstractC0652b.m2217b(c0282a, streakWidget$widgetContent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
