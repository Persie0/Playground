package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: qi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0931qi extends ContextWrapper {

    /* JADX INFO: renamed from: b */
    private static Configuration f47479b;

    /* JADX INFO: renamed from: a */
    public int f47480a;

    /* JADX INFO: renamed from: c */
    private Resources.Theme f47481c;

    /* JADX INFO: renamed from: d */
    private LayoutInflater f47482d;

    /* JADX INFO: renamed from: e */
    private Configuration f47483e;

    /* JADX INFO: renamed from: f */
    private Resources f47484f;

    public C0931qi() {
        super(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX INFO: renamed from: b */
    private final Resources m19343b() {
        if (this.f47484f == null) {
            Configuration configuration = this.f47483e;
            if (configuration == null) {
                this.f47484f = super.getResources();
            } else {
                if (f47479b == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f47479b = configuration2;
                }
                if (configuration.equals(f47479b)) {
                    this.f47484f = super.getResources();
                } else {
                    this.f47484f = C0930qh.m19341a(this, this.f47483e).getResources();
                }
            }
        }
        return this.f47484f;
    }

    /* JADX INFO: renamed from: c */
    private final void m19344c() {
        if (this.f47481c == null) {
            this.f47481c = m19343b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f47481c.setTo(theme);
            }
        }
        this.f47481c.applyStyle(this.f47480a, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m19345a(Configuration configuration) {
        if (this.f47484f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f47483e != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f47483e = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return m19343b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return m19343b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f47482d == null) {
            this.f47482d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f47482d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f47481c;
        if (theme != null) {
            return theme;
        }
        if (this.f47480a == 0) {
            this.f47480a = C0100R.style.Theme_AppCompat_Light;
        }
        m19344c();
        return this.f47481c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f47480a != i) {
            this.f47480a = i;
            m19344c();
        }
    }

    public C0931qi(Context context, int i) {
        super(context);
        this.f47480a = i;
    }

    public C0931qi(Context context, Resources.Theme theme) {
        super(context);
        this.f47481c = theme;
    }
}
