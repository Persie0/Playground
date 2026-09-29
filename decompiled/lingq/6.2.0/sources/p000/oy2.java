package p000;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginTargetApp;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class oy2 extends be2 {

    /* JADX INFO: renamed from: M0 */
    public Dialog f55281M0;

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: C */
    public final void mo2076C() {
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            rf3 rf3Var = sf3.f60790a;
            sf3.m21333b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
            sf3.m21332a(this).getClass();
            FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
            if (this.f5683Y) {
                dialog.setDismissMessage(null);
            }
        }
        super.mo2076C();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        Dialog dialog = this.f55281M0;
        if (dialog instanceof g3b) {
            dialog.getClass();
            ((g3b) dialog).m12346d();
        }
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        Dialog dialog = this.f55281M0;
        if (dialog != null) {
            return dialog;
        }
        id3 id3VarM2105g = m2105g();
        if (id3VarM2105g != null) {
            Intent intent = id3VarM2105g.getIntent();
            intent.getClass();
            id3VarM2105g.setResult(-1, s76.m21137e(intent, null, null));
            id3VarM2105g.finish();
        }
        this.f8413D0 = false;
        return super.mo3662h0(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f5688b0 = true;
        Dialog dialog = this.f55281M0;
        if (!(dialog instanceof g3b) || this.f5685a < 7) {
            return;
        }
        dialog.getClass();
        ((g3b) dialog).m12346d();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        id3 id3VarM2105g;
        String string;
        g3b g3bVar;
        super.mo2124z(bundle);
        if (this.f55281M0 == null && (id3VarM2105g = m2105g()) != null) {
            Intent intent = id3VarM2105g.getIntent();
            intent.getClass();
            Bundle bundleM21139i = s76.m21139i(intent);
            final int i = 0;
            if (bundleM21139i != null ? bundleM21139i.getBoolean("is_fallback", false) : false) {
                string = bundleM21139i != null ? bundleM21139i.getString("url") : null;
                if (bna.m3945d0(string)) {
                    sy2 sy2Var = sy2.f61585a;
                    id3VarM2105g.finish();
                    return;
                }
                final int i2 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{sy2.m21767b()}, 1));
                int i3 = uy2.f64517K;
                string.getClass();
                g3b.m12344b(id3VarM2105g);
                uy2 uy2Var = new uy2(id3VarM2105g, string);
                uy2Var.f40140b = str;
                uy2Var.f40141c = new c3b(this) { // from class: ny2

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ oy2 f53389b;

                    {
                        this.f53389b = this;
                    }

                    @Override // p000.c3b
                    /* JADX INFO: renamed from: a */
                    public final void mo4304a(Bundle bundle2, FacebookException facebookException) {
                        int i4 = i2;
                        oy2 oy2Var = this.f53389b;
                        switch (i4) {
                            case 0:
                                id3 id3VarM2105g2 = oy2Var.m2105g();
                                if (id3VarM2105g2 != null) {
                                    Intent intent2 = id3VarM2105g2.getIntent();
                                    intent2.getClass();
                                    id3VarM2105g2.setResult(facebookException != null ? 0 : -1, s76.m21137e(intent2, bundle2, facebookException));
                                    id3VarM2105g2.finish();
                                    break;
                                }
                                break;
                            default:
                                id3 id3VarM2105g3 = oy2Var.m2105g();
                                if (id3VarM2105g3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    id3VarM2105g3.setResult(-1, intent3);
                                    id3VarM2105g3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                g3bVar = uy2Var;
            } else {
                String string2 = bundleM21139i != null ? bundleM21139i.getString("action") : null;
                Bundle bundle2 = bundleM21139i != null ? bundleM21139i.getBundle("params") : null;
                if (bna.m3945d0(string2)) {
                    sy2 sy2Var2 = sy2.f61585a;
                    id3VarM2105g.finish();
                    return;
                }
                string2.getClass();
                Date date = AccessToken.f11306l;
                AccessToken accessTokenM24363t = x74.m24363t();
                string = x74.m24366w() ? null : sy2.m21767b();
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                c3b c3bVar = new c3b(this) { // from class: ny2

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ oy2 f53389b;

                    {
                        this.f53389b = this;
                    }

                    @Override // p000.c3b
                    /* JADX INFO: renamed from: a */
                    public final void mo4304a(Bundle bundle3, FacebookException facebookException) {
                        int i4 = i;
                        oy2 oy2Var = this.f53389b;
                        switch (i4) {
                            case 0:
                                id3 id3VarM2105g2 = oy2Var.m2105g();
                                if (id3VarM2105g2 != null) {
                                    Intent intent2 = id3VarM2105g2.getIntent();
                                    intent2.getClass();
                                    id3VarM2105g2.setResult(facebookException != null ? 0 : -1, s76.m21137e(intent2, bundle3, facebookException));
                                    id3VarM2105g2.finish();
                                    break;
                                }
                                break;
                            default:
                                id3 id3VarM2105g3 = oy2Var.m2105g();
                                if (id3VarM2105g3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle3 == null) {
                                        bundle3 = new Bundle();
                                    }
                                    intent3.putExtras(bundle3);
                                    id3VarM2105g3.setResult(-1, intent3);
                                    id3VarM2105g3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (accessTokenM24363t != null) {
                    bundle2.putString("app_id", accessTokenM24363t.f11314h);
                    bundle2.putString("access_token", accessTokenM24363t.f11311e);
                } else {
                    bundle2.putString("app_id", string);
                }
                g3b.m12344b(id3VarM2105g);
                g3bVar = new g3b(id3VarM2105g, string2, bundle2, LoginTargetApp.FACEBOOK, c3bVar);
            }
            this.f55281M0 = g3bVar;
        }
    }
}
