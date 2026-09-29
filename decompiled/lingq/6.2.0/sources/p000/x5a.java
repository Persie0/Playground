package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.C0035b;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class x5a implements p32 {

    /* JADX INFO: renamed from: a */
    public Toolbar f67786a;

    /* JADX INFO: renamed from: b */
    public int f67787b;

    /* JADX INFO: renamed from: c */
    public View f67788c;

    /* JADX INFO: renamed from: d */
    public Drawable f67789d;

    /* JADX INFO: renamed from: e */
    public Drawable f67790e;

    /* JADX INFO: renamed from: f */
    public Drawable f67791f;

    /* JADX INFO: renamed from: g */
    public boolean f67792g;

    /* JADX INFO: renamed from: h */
    public CharSequence f67793h;

    /* JADX INFO: renamed from: i */
    public CharSequence f67794i;

    /* JADX INFO: renamed from: j */
    public CharSequence f67795j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f67796k;

    /* JADX INFO: renamed from: l */
    public boolean f67797l;

    /* JADX INFO: renamed from: m */
    public C0035b f67798m;

    /* JADX INFO: renamed from: n */
    public int f67799n;

    /* JADX INFO: renamed from: o */
    public Drawable f67800o;

    /* JADX INFO: renamed from: a */
    public final void m24288a(int i) {
        View view;
        Toolbar toolbar = this.f67786a;
        int i2 = this.f67787b ^ i;
        this.f67787b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m24289b();
                }
                if ((this.f67787b & 4) != 0) {
                    Drawable drawable = this.f67791f;
                    if (drawable == null) {
                        drawable = this.f67800o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m24290c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f67793h);
                    toolbar.setSubtitle(this.f67794i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f67788c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m24289b() {
        if ((this.f67787b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f67795j);
            Toolbar toolbar = this.f67786a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f67799n);
            } else {
                toolbar.setNavigationContentDescription(this.f67795j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24290c() {
        Drawable drawable;
        int i = this.f67787b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f67790e) == null) {
            drawable = this.f67789d;
        }
        this.f67786a.setLogo(drawable);
    }
}
