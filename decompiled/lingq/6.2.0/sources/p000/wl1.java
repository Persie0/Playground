package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* JADX INFO: loaded from: classes.dex */
public final class wl1 extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f66988f;

    /* JADX INFO: renamed from: a */
    public int f66989a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f66990b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f66991c;

    /* JADX INFO: renamed from: d */
    public Configuration f66992d;

    /* JADX INFO: renamed from: e */
    public Resources f66993e;

    public wl1(Context context, int i) {
        super(context);
        this.f66989a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m24044a(Configuration configuration) {
        if (this.f66993e != null) {
            C3386nv.m17633t("getResources() or getAssets() has already been called");
        } else if (this.f66992d == null) {
            this.f66992d = new Configuration(configuration);
        } else {
            C3386nv.m17633t("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m24045b() {
        if (this.f66990b == null) {
            this.f66990b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f66990b.setTo(theme);
            }
        }
        this.f66990b.applyStyle(this.f66989a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f66993e == null) {
            Configuration configuration = this.f66992d;
            if (configuration == null) {
                this.f66993e = super.getResources();
            } else {
                if (f66988f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f66988f = configuration2;
                }
                if (configuration.equals(f66988f)) {
                    this.f66993e = super.getResources();
                } else {
                    this.f66993e = createConfigurationContext(this.f66992d).getResources();
                }
            }
        }
        return this.f66993e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f66991c == null) {
            this.f66991c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f66991c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f66990b;
        if (theme != null) {
            return theme;
        }
        if (this.f66989a == 0) {
            this.f66989a = R$style.Theme_AppCompat_Light;
        }
        m24045b();
        return this.f66990b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f66989a != i) {
            this.f66989a = i;
            m24045b();
        }
    }
}
