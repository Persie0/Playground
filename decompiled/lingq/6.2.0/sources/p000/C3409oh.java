package p000;

import android.content.Context;
import androidx.compose.runtime.ComposeVersion;
import com.amplitude.android.C0880b;
import com.amplitude.common.android.C0901a;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.platform.Plugin$Type;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: oh */
/* JADX INFO: loaded from: classes.dex */
public final class C3409oh implements zf7 {

    /* JADX INFO: renamed from: d */
    public static final Set f54332d = AbstractC3550rv.m20855w0(new String[]{"", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000"});

    /* JADX INFO: renamed from: a */
    public final Plugin$Type f54333a = Plugin$Type.Before;

    /* JADX INFO: renamed from: b */
    public AbstractC0903a f54334b;

    /* JADX INFO: renamed from: c */
    public C0901a f54335c;

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        this.f54334b = abstractC0903a;
        C0880b c0880b = abstractC0903a.f11016a;
        Context context = c0880b.f10789b;
        x8a x8aVar = c0880b.f10797j;
        this.f54335c = new C0901a(context, x8aVar.m24410a("adid"), x8aVar.m24410a("app_set_id"));
        boolean z = false;
        m17993d(c0880b, false);
        abstractC0903a.m5110d().m5125h("sdk.amplitude-analytics-android.version", "1.28.2");
        pj5 pj5VarM5113g = abstractC0903a.m5113g();
        if (b34.m3253t("androidx.compose.ui.node.Owner", pj5VarM5113g) && b34.m3253t("com.amplitude.android.internal.locators.ComposeViewTargetLocator", pj5VarM5113g)) {
            z = true;
        }
        abstractC0903a.m5110d().m5125h("lib.compose.available", String.valueOf(z));
        if (z) {
            String strM21974G = te1.m21974G("META-INF/androidx.compose.runtime_runtime.version", abstractC0903a.m5113g());
            if (strM21974G != null) {
                abstractC0903a.m5110d().m5125h("lib.compose.runtime.version", strM21974G);
            }
            String strM21974G2 = te1.m21974G("META-INF/androidx.compose.ui_ui.version", abstractC0903a.m5113g());
            if (strM21974G2 != null) {
                abstractC0903a.m5110d().m5125h("lib.compose.ui.version", strM21974G2);
            }
            pj5 pj5VarM5113g2 = abstractC0903a.m5113g();
            Integer numValueOf = null;
            try {
                numValueOf = Integer.valueOf(ComposeVersion.class.getDeclaredField("version").getInt(null));
            } catch (Exception e) {
                if (pj5VarM5113g2 != null) {
                    pj5VarM5113g2.mo16256b("Failed to read ComposeVersion.version via reflection: " + e);
                }
            }
            if (numValueOf != null) {
                abstractC0903a.m5110d().m5125h("lib.compose.runtime.compatibility.version", String.valueOf(numValueOf.intValue()));
            }
        }
        C0905a c0905aM5110d = abstractC0903a.m5110d();
        vk4.f65533b.getClass();
        c0905aM5110d.m5125h("lib.kotlin.version", "2.3.21");
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: b */
    public final b90 mo5143b(b90 b90Var) {
        C0880b c0880b = m17992c().f11016a;
        if (b90Var.f8144c == null) {
            b90Var.f8144c = Long.valueOf(System.currentTimeMillis());
        }
        if (b90Var.f8147f == null) {
            b90Var.f8147f = UUID.randomUUID().toString();
        }
        if (b90Var.f8127B == null) {
            b90Var.f8127B = "amplitude-analytics-android/1.28.2";
        }
        if (b90Var.f8142a == null) {
            b90Var.f8142a = (String) m17992c().f11017b.f61248b;
        }
        if (b90Var.f8143b == null) {
            b90Var.f8143b = (String) m17992c().f11017b.f61249c;
        }
        x8a x8aVar = c0880b.f10797j;
        if (x8aVar.m24410a("version_name")) {
            C0901a c0901a = this.f54335c;
            if (c0901a == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8151j = c0901a.m5106a().f56196c;
        }
        if (x8aVar.m24410a("os_name")) {
            C0901a c0901a2 = this.f54335c;
            if (c0901a2 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            c0901a2.m5106a().getClass();
            b90Var.f8153l = "android";
        }
        if (x8aVar.m24410a("os_version")) {
            C0901a c0901a3 = this.f54335c;
            if (c0901a3 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8154m = c0901a3.m5106a().f56197d;
        }
        if (x8aVar.m24410a("device_brand")) {
            C0901a c0901a4 = this.f54335c;
            if (c0901a4 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8155n = c0901a4.m5106a().f56198e;
        }
        if (x8aVar.m24410a("device_manufacturer")) {
            C0901a c0901a5 = this.f54335c;
            if (c0901a5 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8156o = c0901a5.m5106a().f56199f;
        }
        if (x8aVar.m24410a("device_model")) {
            C0901a c0901a6 = this.f54335c;
            if (c0901a6 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8157p = c0901a6.m5106a().f56200g;
        }
        if (x8aVar.m24410a("carrier")) {
            C0901a c0901a7 = this.f54335c;
            if (c0901a7 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8158q = c0901a7.m5106a().f56201h;
        }
        if (x8aVar.m24410a("ip_address") && b90Var.f8128C == null) {
            b90Var.f8128C = "$remote";
        }
        if (x8aVar.m24410a("country") && b90Var.f8128C != "$remote") {
            C0901a c0901a8 = this.f54335c;
            if (c0901a8 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8159r = c0901a8.m5106a().f56195b;
        }
        if (x8aVar.m24410a("language")) {
            C0901a c0901a9 = this.f54335c;
            if (c0901a9 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            b90Var.f8126A = c0901a9.m5106a().f56202i;
        }
        if (x8aVar.m24410a("platform")) {
            b90Var.f8152k = "Android";
        }
        if (x8aVar.m24410a("lat_lng") && this.f54335c == null) {
            fa4.m11636J("contextProvider");
            throw null;
        }
        if (x8aVar.m24410a("adid")) {
            C0901a c0901a10 = this.f54335c;
            if (c0901a10 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            String str = c0901a10.m5106a().f56194a;
            if (str != null) {
                b90Var.f8165x = str;
            }
        }
        if (x8aVar.m24410a("app_set_id")) {
            C0901a c0901a11 = this.f54335c;
            if (c0901a11 == null) {
                fa4.m11636J("contextProvider");
                throw null;
            }
            String str2 = c0901a11.m5106a().f56203j;
            if (str2 != null) {
                b90Var.f8166y = str2;
            }
        }
        if (b90Var.f8136K == null) {
            m17992c();
        }
        if (b90Var.f8129D == null) {
            m17992c();
        }
        if (b90Var.f8130E == null) {
            m17992c();
        }
        return b90Var;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0903a m17992c() {
        AbstractC0903a abstractC0903a = this.f54334b;
        if (abstractC0903a != null) {
            return abstractC0903a;
        }
        fa4.m11636J("amplitude");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m17993d(C0880b c0880b, boolean z) {
        String str;
        if (z || (str = (String) m17992c().f11017b.f61249c) == null || !AbstractC3695vr.m23488F(str) || cl9.m4833P(str, "S", false)) {
            m17992c().m5116j(UUID.randomUUID().toString() + 'R');
        }
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        return this.f54333a;
    }
}
