package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.customviews.CloseImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p290o6.C7979r0;
import p290o6.InterfaceC7953e0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2211c extends Fragment {

    /* JADX INFO: renamed from: B0 */
    public WeakReference<InterfaceC2222h0> f11180B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC7953e0 f11181C0;

    /* JADX INFO: renamed from: w0 */
    public CleverTapInstanceConfig f11183w0;

    /* JADX INFO: renamed from: x0 */
    public Context f11184x0;

    /* JADX INFO: renamed from: y0 */
    public int f11185y0;

    /* JADX INFO: renamed from: z0 */
    public CTInAppNotification f11186z0;

    /* JADX INFO: renamed from: v0 */
    public CloseImageView f11182v0 = null;

    /* JADX INFO: renamed from: A0 */
    public final AtomicBoolean f11179A0 = new AtomicBoolean();

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.c$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC7953e0 interfaceC7953e0;
            InterfaceC7953e0 interfaceC7953e1;
            int iIntValue = ((Integer) view.getTag()).intValue();
            AbstractC2211c abstractC2211c = AbstractC2211c.this;
            abstractC2211c.getClass();
            try {
                CTInAppNotificationButton cTInAppNotificationButton = abstractC2211c.f11186z0.f11107f.get(iIntValue);
                Bundle bundle = new Bundle();
                bundle.putString("wzrk_id", abstractC2211c.f11186z0.f11109g);
                bundle.putString("wzrk_c2a", cTInAppNotificationButton.f11130h);
                HashMap<String, String> map = cTInAppNotificationButton.f11129g;
                InterfaceC2222h0 interfaceC2222h0M6516q0 = abstractC2211c.m6516q0();
                if (interfaceC2222h0M6516q0 != null) {
                    interfaceC2222h0M6516q0.mo6436D(abstractC2211c.f11186z0, bundle, map);
                }
                if (iIntValue == 0) {
                    CTInAppNotification cTInAppNotification = abstractC2211c.f11186z0;
                    if (cTInAppNotification.f11114i0 && (interfaceC7953e1 = abstractC2211c.f11181C0) != null) {
                        interfaceC7953e1.mo6437F(cTInAppNotification.f11116j0);
                        return;
                    }
                }
                if (iIntValue == 1 && abstractC2211c.f11186z0.f11114i0) {
                    abstractC2211c.m6513n0(bundle);
                    return;
                }
                String str = cTInAppNotificationButton.f11132j;
                if (str != null && str.contains("rfp") && (interfaceC7953e0 = abstractC2211c.f11181C0) != null) {
                    interfaceC7953e0.mo6437F(cTInAppNotificationButton.f11133k);
                    return;
                }
                String str2 = cTInAppNotificationButton.f11123a;
                if (str2 != null) {
                    abstractC2211c.m6514o0(bundle, str2);
                } else {
                    abstractC2211c.m6513n0(bundle);
                }
            } catch (Throwable th2) {
                C2181a c2181aM6433b = abstractC2211c.f11183w0.m6433b();
                String str3 = "Error handling notification button click: " + th2.getCause();
                c2181aM6433b.getClass();
                C2181a.m6451c(str3);
                abstractC2211c.m6513n0(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public void mo467F(Context context) {
        super.mo467F(context);
        this.f11184x0 = context;
        Bundle bundle = this.f6101g;
        if (bundle != null) {
            this.f11186z0 = (CTInAppNotification) bundle.getParcelable("inApp");
            this.f11183w0 = (CleverTapInstanceConfig) bundle.getParcelable("config");
            this.f11185y0 = m3599s().getConfiguration().orientation;
            mo6515p0();
            if (context instanceof InterfaceC7953e0) {
                this.f11181C0 = (InterfaceC7953e0) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public void mo3572U(View view, Bundle bundle) {
        InterfaceC2222h0 interfaceC2222h0M6516q0 = m6516q0();
        if (interfaceC2222h0M6516q0 != null) {
            interfaceC2222h0M6516q0.mo6446y(this.f11186z0);
        }
    }

    /* JADX INFO: renamed from: m0 */
    abstract void mo6512m0();

    /* JADX INFO: renamed from: n0 */
    public final void m6513n0(Bundle bundle) {
        mo6512m0();
        InterfaceC2222h0 interfaceC2222h0M6516q0 = m6516q0();
        if (interfaceC2222h0M6516q0 == null || m3582e() == null || m3582e().getBaseContext() == null) {
            return;
        }
        interfaceC2222h0M6516q0.mo6445c(m3582e().getBaseContext(), this.f11186z0, bundle);
    }

    /* JADX INFO: renamed from: o0 */
    final void m6514o0(Bundle bundle, String str) {
        try {
            Uri uri = Uri.parse(str.replace("\n", "").replace("\r", ""));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Bundle bundle2 = new Bundle();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                for (String str2 : queryParameterNames) {
                    bundle2.putString(str2, uri.getQueryParameter(str2));
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!bundle2.isEmpty()) {
                intent.putExtras(bundle2);
            }
            C7979r0.m15843j(m3582e(), intent);
            m3595l0(intent);
        } catch (Throwable unused) {
        }
        m6513n0(bundle);
    }

    /* JADX INFO: renamed from: p0 */
    public abstract void mo6515p0();

    /* JADX INFO: renamed from: q0 */
    final InterfaceC2222h0 m6516q0() {
        InterfaceC2222h0 interfaceC2222h0;
        try {
            interfaceC2222h0 = this.f11180B0.get();
        } catch (Throwable unused) {
            interfaceC2222h0 = null;
        }
        if (interfaceC2222h0 == null) {
            C2181a c2181aM6433b = this.f11183w0.m6433b();
            String str = this.f11183w0.f10995a;
            String str2 = "InAppListener is null for notification: " + this.f11186z0.f11088R;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, str2);
        }
        return interfaceC2222h0;
    }

    /* JADX INFO: renamed from: r0 */
    final int m6517r0(int i10) {
        return (int) TypedValue.applyDimension(1, i10, m3599s().getDisplayMetrics());
    }
}
