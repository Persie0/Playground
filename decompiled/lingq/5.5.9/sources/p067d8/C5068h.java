package p067d8;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginTargetApp;
import dm.C5207g;
import java.util.Date;
import kotlin.Metadata;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Ld8/h;", "Landroidx/fragment/app/l;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class C5068h extends DialogInterfaceOnCancelListenerC0962l {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ int f32948M0 = 0;

    /* JADX INFO: renamed from: L0 */
    public Dialog f32949L0;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        ActivityC0979t activityC0979tM3582e;
        String string;
        DialogC5064e0 dialogC5071k;
        super.mo3560H(bundle);
        if (this.f32949L0 == null && (activityC0979tM3582e = m3582e()) != null) {
            Intent intent = activityC0979tM3582e.getIntent();
            C5079s c5079s = C5079s.f32992a;
            C5207g.m11110e(intent, "intent");
            Bundle bundleM10786h = C5079s.m10786h(intent);
            if (bundleM10786h == null ? false : bundleM10786h.getBoolean("is_fallback", false)) {
                string = bundleM10786h != null ? bundleM10786h.getString("url") : null;
                if (C5086z.m10802A(string)) {
                    C5086z.m10807F("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activityC0979tM3582e.finish();
                    return;
                }
                String strM770q = C0166e.m770q(new Object[]{C8004n.m15872b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i10 = DialogC5071k.f32957J;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                DialogC5064e0.m10755a(activityC0979tM3582e);
                dialogC5071k = new DialogC5071k(activityC0979tM3582e, string, strM770q);
                dialogC5071k.f32922c = new DialogC5064e0.c() { // from class: d8.g
                    @Override // p067d8.DialogC5064e0.c
                    /* JADX INFO: renamed from: a */
                    public final void mo6730a(Bundle bundle2, FacebookException facebookException) {
                        int i11 = C5068h.f32948M0;
                        C5068h c5068h = this.f32947a;
                        C5207g.m11111f(c5068h, "this$0");
                        ActivityC0979t activityC0979tM3582e2 = c5068h.m3582e();
                        if (activityC0979tM3582e2 == null) {
                            return;
                        }
                        Intent intent2 = new Intent();
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        intent2.putExtras(bundle2);
                        activityC0979tM3582e2.setResult(-1, intent2);
                        activityC0979tM3582e2.finish();
                    }
                };
            } else {
                String string2 = bundleM10786h == null ? null : bundleM10786h.getString("action");
                Bundle bundle2 = bundleM10786h == null ? null : bundleM10786h.getBundle("params");
                if (C5086z.m10802A(string2)) {
                    C5086z.m10807F("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activityC0979tM3582e.finish();
                    return;
                }
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                Date date = AccessToken.f11370l;
                AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                string = AccessToken.C2262b.m6596c() ? null : C5086z.m10832q(activityC0979tM3582e);
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                DialogC5064e0.c cVar = new DialogC5064e0.c() { // from class: d8.f
                    @Override // p067d8.DialogC5064e0.c
                    /* JADX INFO: renamed from: a */
                    public final void mo6730a(Bundle bundle3, FacebookException facebookException) {
                        int i11 = C5068h.f32948M0;
                        C5068h c5068h = this.f32942a;
                        C5207g.m11111f(c5068h, "this$0");
                        c5068h.m10762t0(bundle3, facebookException);
                    }
                };
                if (accessTokenM6595b != null) {
                    bundle2.putString("app_id", accessTokenM6595b.f11378h);
                    bundle2.putString("access_token", accessTokenM6595b.f11375e);
                } else {
                    bundle2.putString("app_id", string);
                }
                int i11 = DialogC5064e0.f32919H;
                DialogC5064e0.m10755a(activityC0979tM3582e);
                dialogC5071k = new DialogC5064e0(activityC0979tM3582e, string2, bundle2, LoginTargetApp.FACEBOOK, cVar);
            }
            this.f32949L0 = dialogC5071k;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: K */
    public final void mo3563K() {
        Dialog dialog = this.f6328G0;
        if (dialog != null) {
            FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
            GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
            FragmentStrictMode.m3801c(getRetainInstanceUsageViolation);
            FragmentStrictMode.C0978a c0978aM3799a = FragmentStrictMode.m3799a(this);
            if (c0978aM3799a.f6403a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m3803e(c0978aM3799a, C5068h.class, GetRetainInstanceUsageViolation.class)) {
                FragmentStrictMode.m3800b(c0978aM3799a, getRetainInstanceUsageViolation);
            }
            if (this.f6086X) {
                dialog.setDismissMessage(null);
            }
        }
        super.mo3563K();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        Dialog dialog = this.f32949L0;
        if (dialog instanceof DialogC5064e0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((DialogC5064e0) dialog).m10757c();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C5207g.m11111f(configuration, "newConfig");
        boolean z10 = true;
        this.f6090a0 = true;
        Dialog dialog = this.f32949L0;
        if (dialog instanceof DialogC5064e0) {
            if (this.f6089a < 7) {
                z10 = false;
            }
            if (z10) {
                if (dialog == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
                }
                ((DialogC5064e0) dialog).m10757c();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public final Dialog mo3769p0(Bundle bundle) {
        Dialog dialog = this.f32949L0;
        if (dialog == null) {
            m10762t0(null, null);
            this.f6324C0 = false;
            return super.mo3769p0(bundle);
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10762t0(Bundle bundle, FacebookException facebookException) {
        ActivityC0979t activityC0979tM3582e = m3582e();
        if (activityC0979tM3582e == null) {
            return;
        }
        C5079s c5079s = C5079s.f32992a;
        Intent intent = activityC0979tM3582e.getIntent();
        C5207g.m11110e(intent, "fragmentActivity.intent");
        activityC0979tM3582e.setResult(facebookException == null ? -1 : 0, C5079s.m10785e(intent, bundle, facebookException));
        activityC0979tM3582e.finish();
    }
}
