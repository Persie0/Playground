package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ei */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0157ei extends ActivityC0080bz implements abp {

    /* JADX INFO: renamed from: q */
    private AbstractC0160el f14119q;

    public ActivityC0157ei() {
        getSavedStateRegistry().m1859b("androidx:appcompat", new C0088cg(this, 2));
        m19317l(new C0156eh(this, 0));
    }

    /* JADX INFO: renamed from: n */
    private final void m7341n() {
        aci.m194c(getWindow().getDecorView(), this);
        acj.m196b(getWindow().getDecorView(), this);
        afh.m469A(getWindow().getDecorView(), this);
        C0209gg.m9201c(getWindow().getDecorView(), this);
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7341n();
        m7343j().mo7435d(view, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        C0931qi c0931qi;
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) m7343j();
        layoutInflaterFactory2C0179fd.f21344C = true;
        int iM8251r = layoutInflaterFactory2C0179fd.m8251r(context, layoutInflaterFactory2C0179fd.m8250q());
        if (LayoutInflaterFactory2C0179fd.m7431n(context) && AbstractC0160el.m7431n(context) && !AbstractC0160el.f14535c) {
            AbstractC0160el.f14533a.execute(new RunnableC0059be(context, 7));
        }
        Configuration configuration3 = null;
        if (LayoutInflaterFactory2C0179fd.f21341g && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, null, false));
            } catch (IllegalStateException e) {
                if (context instanceof C0931qi) {
                    ((C0931qi) context).m19345a(layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, null, false));
                } else if (LayoutInflaterFactory2C0179fd.f21340f) {
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = C0166er.m7713b(context, configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration2 != null) {
                            if (configuration.fontScale != configuration2.fontScale) {
                                configuration3.fontScale = configuration2.fontScale;
                            }
                            if (configuration.mcc != configuration2.mcc) {
                                configuration3.mcc = configuration2.mcc;
                            }
                            if (configuration.mnc != configuration2.mnc) {
                                configuration3.mnc = configuration2.mnc;
                            }
                            C0168et.m7833b(configuration, configuration2, configuration3);
                            if (configuration.touchscreen != configuration2.touchscreen) {
                                configuration3.touchscreen = configuration2.touchscreen;
                            }
                            if (configuration.keyboard != configuration2.keyboard) {
                                configuration3.keyboard = configuration2.keyboard;
                            }
                            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                configuration3.keyboardHidden = configuration2.keyboardHidden;
                            }
                            if (configuration.navigation != configuration2.navigation) {
                                configuration3.navigation = configuration2.navigation;
                            }
                            if (configuration.navigationHidden != configuration2.navigationHidden) {
                                configuration3.navigationHidden = configuration2.navigationHidden;
                            }
                            if (configuration.orientation != configuration2.orientation) {
                                configuration3.orientation = configuration2.orientation;
                            }
                            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 15;
                            }
                            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 192;
                            }
                            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 48;
                            }
                            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 768;
                            }
                            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                configuration3.colorMode |= configuration2.colorMode & 3;
                            }
                            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                configuration3.colorMode |= configuration2.colorMode & 12;
                            }
                            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                configuration3.uiMode |= configuration2.uiMode & 15;
                            }
                            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                configuration3.uiMode |= configuration2.uiMode & 48;
                            }
                            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                configuration3.screenWidthDp = configuration2.screenWidthDp;
                            }
                            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                configuration3.screenHeightDp = configuration2.screenHeightDp;
                            }
                            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                            }
                            if (configuration.densityDpi != configuration2.densityDpi) {
                                configuration3.densityDpi = configuration2.densityDpi;
                            }
                        }
                    }
                    Configuration configurationM8249P = layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, configuration3, true);
                    c0931qi = new C0931qi(context, C0100R.style.Theme_AppCompat_Empty);
                    c0931qi.m19345a(configurationM8249P);
                    if (context.getTheme() != null) {
                        acm.m202a(c0931qi.getTheme());
                    }
                    context = c0931qi;
                }
            }
        } else if (context instanceof C0931qi) {
            try {
                ((C0931qi) context).m19345a(layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, null, false));
            } catch (IllegalStateException e2) {
                if (LayoutInflaterFactory2C0179fd.f21340f) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = C0166er.m7713b(context, configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration2 != null) {
                            if (configuration.fontScale != configuration2.fontScale) {
                                configuration3.fontScale = configuration2.fontScale;
                            }
                            if (configuration.mcc != configuration2.mcc) {
                                configuration3.mcc = configuration2.mcc;
                            }
                            if (configuration.mnc != configuration2.mnc) {
                                configuration3.mnc = configuration2.mnc;
                            }
                            C0168et.m7833b(configuration, configuration2, configuration3);
                            if (configuration.touchscreen != configuration2.touchscreen) {
                                configuration3.touchscreen = configuration2.touchscreen;
                            }
                            if (configuration.keyboard != configuration2.keyboard) {
                                configuration3.keyboard = configuration2.keyboard;
                            }
                            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                configuration3.keyboardHidden = configuration2.keyboardHidden;
                            }
                            if (configuration.navigation != configuration2.navigation) {
                                configuration3.navigation = configuration2.navigation;
                            }
                            if (configuration.navigationHidden != configuration2.navigationHidden) {
                                configuration3.navigationHidden = configuration2.navigationHidden;
                            }
                            if (configuration.orientation != configuration2.orientation) {
                                configuration3.orientation = configuration2.orientation;
                            }
                            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 15;
                            }
                            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 192;
                            }
                            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 48;
                            }
                            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 768;
                            }
                            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                configuration3.colorMode |= configuration2.colorMode & 3;
                            }
                            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                configuration3.colorMode |= configuration2.colorMode & 12;
                            }
                            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                configuration3.uiMode |= configuration2.uiMode & 15;
                            }
                            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                configuration3.uiMode |= configuration2.uiMode & 48;
                            }
                            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                configuration3.screenWidthDp = configuration2.screenWidthDp;
                            }
                            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                configuration3.screenHeightDp = configuration2.screenHeightDp;
                            }
                            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                            }
                            if (configuration.densityDpi != configuration2.densityDpi) {
                                configuration3.densityDpi = configuration2.densityDpi;
                            }
                        }
                    }
                    Configuration configurationM8249P2 = layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, configuration3, true);
                    c0931qi = new C0931qi(context, C0100R.style.Theme_AppCompat_Empty);
                    c0931qi.m19345a(configurationM8249P2);
                    try {
                        if (context.getTheme() != null) {
                            acm.m202a(c0931qi.getTheme());
                        }
                    } catch (NullPointerException e3) {
                    }
                    context = c0931qi;
                }
            }
        } else if (LayoutInflaterFactory2C0179fd.f21340f) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = C0166er.m7713b(context, configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration2 != null && configuration.diff(configuration2) != 0) {
                    if (configuration.fontScale != configuration2.fontScale) {
                        configuration3.fontScale = configuration2.fontScale;
                    }
                    if (configuration.mcc != configuration2.mcc) {
                        configuration3.mcc = configuration2.mcc;
                    }
                    if (configuration.mnc != configuration2.mnc) {
                        configuration3.mnc = configuration2.mnc;
                    }
                    C0168et.m7833b(configuration, configuration2, configuration3);
                    if (configuration.touchscreen != configuration2.touchscreen) {
                        configuration3.touchscreen = configuration2.touchscreen;
                    }
                    if (configuration.keyboard != configuration2.keyboard) {
                        configuration3.keyboard = configuration2.keyboard;
                    }
                    if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                        configuration3.keyboardHidden = configuration2.keyboardHidden;
                    }
                    if (configuration.navigation != configuration2.navigation) {
                        configuration3.navigation = configuration2.navigation;
                    }
                    if (configuration.navigationHidden != configuration2.navigationHidden) {
                        configuration3.navigationHidden = configuration2.navigationHidden;
                    }
                    if (configuration.orientation != configuration2.orientation) {
                        configuration3.orientation = configuration2.orientation;
                    }
                    if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 15;
                    }
                    if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 192;
                    }
                    if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 48;
                    }
                    if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 768;
                    }
                    if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                        configuration3.colorMode |= configuration2.colorMode & 3;
                    }
                    if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                        configuration3.colorMode |= configuration2.colorMode & 12;
                    }
                    if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                        configuration3.uiMode |= configuration2.uiMode & 15;
                    }
                    if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                        configuration3.uiMode |= configuration2.uiMode & 48;
                    }
                    if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                        configuration3.screenWidthDp = configuration2.screenWidthDp;
                    }
                    if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                        configuration3.screenHeightDp = configuration2.screenHeightDp;
                    }
                    if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                        configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                    }
                    if (configuration.densityDpi != configuration2.densityDpi) {
                        configuration3.densityDpi = configuration2.densityDpi;
                    }
                }
            }
            Configuration configurationM8249P3 = layoutInflaterFactory2C0179fd.m8249P(context, iM8251r, configuration3, true);
            c0931qi = new C0931qi(context, C0100R.style.Theme_AppCompat_Empty);
            c0931qi.m19345a(configurationM8249P3);
            if (context.getTheme() != null) {
                acm.m202a(c0931qi.getTheme());
            }
            context = c0931qi;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC0146dy abstractC0146dyM7342i = m7342i();
        if (getWindow().hasFeature(0)) {
            if (abstractC0146dyM7342i == null || !abstractC0146dyM7342i.mo6904k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p000.ActivityC0136do, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0146dy abstractC0146dyM7342i = m7342i();
        if (keyCode == 82 && abstractC0146dyM7342i != null && abstractC0146dyM7342i.mo6908o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return m7343j().mo7434c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) m7343j();
        if (layoutInflaterFactory2C0179fd.f21378m == null) {
            layoutInflaterFactory2C0179fd.m8236C();
            AbstractC0146dy abstractC0146dy = layoutInflaterFactory2C0179fd.f21377l;
            layoutInflaterFactory2C0179fd.f21378m = new C0206gd(abstractC0146dy != null ? abstractC0146dy.mo6895b() : layoutInflaterFactory2C0179fd.f21374i);
        }
        return layoutInflaterFactory2C0179fd.f21378m;
    }

    @Override // p000.abp
    /* JADX INFO: renamed from: h */
    public final Intent mo145h() {
        return C0995ss.m19424f(this);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0146dy m7342i() {
        return m7343j().mo7433b();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m7343j().mo7437f();
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0160el m7343j() {
        if (this.f14119q == null) {
            int i = AbstractC0160el.f14534b;
            this.f14119q = new LayoutInflaterFactory2C0179fd(this, null, this);
        }
        return this.f14119q;
    }

    @Override // p000.ActivityC0907pl, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC0146dy abstractC0146dyMo7433b;
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) m7343j();
        if (layoutInflaterFactory2C0179fd.f21388w && layoutInflaterFactory2C0179fd.f21385t && (abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd.mo7433b()) != null) {
            abstractC0146dyMo7433b.mo6910q();
        }
        C0271io.m11552d().m11556e(layoutInflaterFactory2C0179fd.f21374i);
        layoutInflaterFactory2C0179fd.f21346E = new Configuration(layoutInflaterFactory2C0179fd.f21374i.getResources().getConfiguration());
        layoutInflaterFactory2C0179fd.m8248O(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m7343j().mo7438g();
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM19424f;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0146dy abstractC0146dyM7342i = m7342i();
        if (menuItem.getItemId() != 16908332 || abstractC0146dyM7342i == null || (abstractC0146dyM7342i.mo6894a() & 4) == 0 || (intentM19424f = C0995ss.m19424f(this)) == null) {
            return false;
        }
        if (!aax.m68c(this, intentM19424f)) {
            aax.m67b(this, intentM19424f);
            return true;
        }
        abq abqVar = new abq(this);
        Intent intentMo145h = mo145h();
        if (intentMo145h == null) {
            intentMo145h = C0995ss.m19424f(this);
        }
        if (intentMo145h != null) {
            ComponentName component = intentMo145h.getComponent();
            if (component == null) {
                component = intentMo145h.resolveActivity(abqVar.f64b.getPackageManager());
            }
            int size = abqVar.f63a.size();
            try {
                for (Intent intentM19425g = C0995ss.m19425g(abqVar.f64b, component); intentM19425g != null; intentM19425g = C0995ss.m19425g(abqVar.f64b, intentM19425g.getComponent())) {
                    abqVar.f63a.add(size, intentM19425g);
                }
                abqVar.f63a.add(intentMo145h);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        if (abqVar.f63a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) abqVar.f63a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        abr.m146a(abqVar.f64b, intentArr, null);
        try {
            aap.m29a(this);
            return true;
        } catch (IllegalStateException e2) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0179fd) m7343j()).m8235B();
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        AbstractC0146dy abstractC0146dyMo7433b = ((LayoutInflaterFactory2C0179fd) m7343j()).mo7433b();
        if (abstractC0146dyMo7433b != null) {
            abstractC0146dyMo7433b.mo6901h(true);
        }
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0179fd) m7343j()).m8248O(true);
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onStop() {
        super.onStop();
        m7343j().mo7439h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m7343j().mo7443m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC0146dy abstractC0146dyM7342i = m7342i();
        if (getWindow().hasFeature(0)) {
            if (abstractC0146dyM7342i == null || !abstractC0146dyM7342i.mo6909p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(int i) {
        m7341n();
        m7343j().mo7440j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0179fd) m7343j()).f21347F = i;
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(View view) {
        m7341n();
        m7343j().mo7441k(view);
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7341n();
        m7343j().mo7442l(view, layoutParams);
    }
}
