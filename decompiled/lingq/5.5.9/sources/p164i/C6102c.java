package p164i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.linguist.R;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6102c extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f35852f;

    /* JADX INFO: renamed from: a */
    public int f35853a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f35854b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f35855c;

    /* JADX INFO: renamed from: d */
    public Configuration f35856d;

    /* JADX INFO: renamed from: e */
    public Resources f35857e;

    /* JADX INFO: renamed from: i.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Context m12601a(C6102c c6102c, Configuration configuration) {
            return c6102c.createConfigurationContext(configuration);
        }
    }

    public C6102c() {
        super(null);
    }

    public C6102c(Context context, int i10) {
        super(context);
        this.f35853a = i10;
    }

    public C6102c(Context context, Resources.Theme theme) {
        super(context);
        this.f35854b = theme;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12599a(Configuration configuration) {
        if (this.f35857e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f35856d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f35856d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m12600b() {
        if (this.f35854b == null) {
            this.f35854b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f35854b.setTo(theme);
            }
        }
        this.f35854b.applyStyle(this.f35853a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f35857e == null) {
            Configuration configuration = this.f35856d;
            if (configuration == null) {
                this.f35857e = super.getResources();
            } else {
                if (f35852f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f35852f = configuration2;
                }
                if (configuration.equals(f35852f)) {
                    this.f35857e = super.getResources();
                } else {
                    this.f35857e = a.m12601a(this, this.f35856d).getResources();
                }
            }
        }
        return this.f35857e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f35855c == null) {
            this.f35855c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f35855c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f35854b;
        if (theme != null) {
            return theme;
        }
        if (this.f35853a == 0) {
            this.f35853a = R.style.Theme_AppCompat_Light;
        }
        m12600b();
        return this.f35854b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f35853a != i10) {
            this.f35853a = i10;
            m12600b();
        }
    }
}
