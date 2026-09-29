package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$style;

/* JADX INFO: renamed from: dp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2935dp extends id3 implements InterfaceC3046gp {

    /* JADX INFO: renamed from: V */
    public LayoutInflaterFactory2C3804yp f35981V;

    public AbstractActivityC2935dp() {
        ((fs6) this.f63700d.f39591c).m12094I("androidx:appcompat", new C0819bp(this));
        m22669g(new C2892cp(this, 0));
    }

    @Override // p000.uc1, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22670h();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        layoutInflaterFactory2C3804yp.m25236v();
        ((ViewGroup) layoutInflaterFactory2C3804yp.f70198U.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C3804yp.f70185H.m22259b(layoutInflaterFactory2C3804yp.f70217l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01be  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        wl1 wl1Var;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        layoutInflaterFactory2C3804yp.f70212i0 = true;
        int i41 = layoutInflaterFactory2C3804yp.f70219m0;
        if (i41 == -100) {
            i41 = AbstractC3343mp.f51674b;
        }
        int iM25222A = layoutInflaterFactory2C3804yp.m25222A(context, i41);
        if (AbstractC3343mp.m16965b(context) && AbstractC3343mp.m16965b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC3343mp.f51681i) {
                    try {
                        yi5 yi5Var = AbstractC3343mp.f51675c;
                        if (yi5Var == null) {
                            if (AbstractC3343mp.f51676d == null) {
                                AbstractC3343mp.f51676d = yi5.m25154a(xq6.m24648e(context));
                            }
                            if (!AbstractC3343mp.f51676d.f69868a.f71609a.isEmpty()) {
                                AbstractC3343mp.f51675c = AbstractC3343mp.f51676d;
                            }
                        } else if (!yi5Var.equals(AbstractC3343mp.f51676d)) {
                            yi5 yi5Var2 = AbstractC3343mp.f51675c;
                            AbstractC3343mp.f51676d = yi5Var2;
                            xq6.m24647d(context, yi5Var2.f69868a.f71609a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC3343mp.f51678f) {
                AbstractC3343mp.f51673a.execute(new RunnableC3781y2(context, 2));
            }
        }
        yi5 yi5VarM25220n = LayoutInflaterFactory2C3804yp.m25220n(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof wl1) {
                    try {
                        ((wl1) context).m24044a(LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C3804yp.f70183D0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    AbstractC3544rp.m20735a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    i25 = configuration.colorMode & 3;
                                    i26 = configuration2.colorMode & 3;
                                    if (i25 != i26) {
                                        configuration3.colorMode |= i26;
                                    }
                                    i27 = configuration.colorMode & 12;
                                    i28 = configuration2.colorMode & 12;
                                    if (i27 != i28) {
                                        configuration3.colorMode |= i28;
                                    }
                                    i29 = configuration.uiMode & 15;
                                    i30 = configuration2.uiMode & 15;
                                    if (i29 != i30) {
                                        configuration3.uiMode |= i30;
                                    }
                                    i31 = configuration.uiMode & 48;
                                    i32 = configuration2.uiMode & 48;
                                    if (i31 != i32) {
                                        configuration3.uiMode |= i32;
                                    }
                                    i33 = configuration.screenWidthDp;
                                    i34 = configuration2.screenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.screenWidthDp = i34;
                                    }
                                    i35 = configuration.screenHeightDp;
                                    i36 = configuration2.screenHeightDp;
                                    if (i35 != i36) {
                                        configuration3.screenHeightDp = i36;
                                    }
                                    i37 = configuration.smallestScreenWidthDp;
                                    i38 = configuration2.smallestScreenWidthDp;
                                    if (i37 != i38) {
                                        configuration3.smallestScreenWidthDp = i38;
                                    }
                                    i39 = configuration.densityDpi;
                                    i40 = configuration2.densityDpi;
                                    if (i39 != i40) {
                                        configuration3.densityDpi = i40;
                                    }
                                }
                            }
                            Configuration configurationM25221r = LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, configuration3, true);
                            wl1Var = new wl1(context, R$style.Theme_AppCompat_Empty);
                            wl1Var.m24044a(configurationM25221r);
                            try {
                                if (context.getTheme() != null) {
                                    wl1Var.getTheme().rebase();
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = wl1Var;
                        }
                    }
                } else if (LayoutInflaterFactory2C3804yp.f70183D0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            AbstractC3544rp.m20735a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    }
                    Configuration configurationM25221r2 = LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, configuration3, true);
                    wl1Var = new wl1(context, R$style.Theme_AppCompat_Empty);
                    wl1Var.m24044a(configurationM25221r2);
                    if (context.getTheme() != null) {
                        wl1Var.getTheme().rebase();
                    }
                    context = wl1Var;
                }
            }
        } else if (context instanceof wl1) {
            ((wl1) context).m24044a(LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, null, false));
        } else if (LayoutInflaterFactory2C3804yp.f70183D0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    AbstractC3544rp.m20735a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            }
            Configuration configurationM25221r3 = LayoutInflaterFactory2C3804yp.m25221r(context, iM25222A, yi5VarM25220n, configuration3, true);
            wl1Var = new wl1(context, R$style.Theme_AppCompat_Empty);
            wl1Var.m24044a(configurationM25221r3);
            if (context.getTheme() != null) {
                wl1Var.getTheme().rebase();
            }
            context = wl1Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C3804yp) m10565l()).m25239y();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p000.tc1, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C3804yp) m10565l()).m25239y();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        layoutInflaterFactory2C3804yp.m25236v();
        return layoutInflaterFactory2C3804yp.f70217l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        if (layoutInflaterFactory2C3804yp.f70187J == null) {
            layoutInflaterFactory2C3804yp.m25239y();
            z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
            layoutInflaterFactory2C3804yp.f70187J = new un9(z4bVar != null ? z4bVar.m25459b() : layoutInflaterFactory2C3804yp.f70215k);
        }
        return layoutInflaterFactory2C3804yp.f70187J;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = qoa.f58020a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        if (layoutInflaterFactory2C3804yp.f70186I != null) {
            layoutInflaterFactory2C3804yp.m25239y();
            layoutInflaterFactory2C3804yp.f70186I.getClass();
            layoutInflaterFactory2C3804yp.m25240z(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC3343mp m10565l() {
        if (this.f35981V == null) {
            by8 by8Var = AbstractC3343mp.f51673a;
            this.f35981V = new LayoutInflaterFactory2C3804yp(this, null, this, this);
        }
        return this.f35981V;
    }

    @Override // p000.uc1, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        if (layoutInflaterFactory2C3804yp.f70203Z && layoutInflaterFactory2C3804yp.f70197T) {
            layoutInflaterFactory2C3804yp.m25239y();
            z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
            if (z4bVar != null) {
                z4bVar.m25462e(z4bVar.f70905a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs));
            }
        }
        C2893cq c2893cqM9843a = C2893cq.m9843a();
        Context context = layoutInflaterFactory2C3804yp.f70215k;
        synchronized (c2893cqM9843a) {
            a88 a88Var = c2893cqM9843a.f34366a;
            synchronized (a88Var) {
                tk5 tk5Var = (tk5) a88Var.f359b.get(context);
                if (tk5Var != null) {
                    tk5Var.m22175a();
                }
            }
        }
        layoutInflaterFactory2C3804yp.f70218l0 = new Configuration(layoutInflaterFactory2C3804yp.f70215k.getResources().getConfiguration());
        layoutInflaterFactory2C3804yp.m25229l(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p000.id3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m10565l().mo16969d();
    }

    @Override // p000.id3, p000.uc1, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM19523s;
        if (!super.onMenuItemSelected(i, menuItem)) {
            LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
            layoutInflaterFactory2C3804yp.m25239y();
            z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
            if (menuItem.getItemId() != 16908332 || z4bVar == null || (((x5a) z4bVar.f70909e).f67787b & 4) == 0 || (intentM19523s = pvc.m19523s(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM19523s)) {
                navigateUpTo(intentM19523s);
                return true;
            }
            wf9 wf9VarM23894h = wf9.m23894h(this);
            wf9VarM23894h.m23896f(this);
            wf9VarM23894h.m23898i();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C3804yp) m10565l()).m25236v();
    }

    @Override // p000.id3, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        layoutInflaterFactory2C3804yp.m25239y();
        z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
        if (z4bVar != null) {
            z4bVar.f70924t = true;
        }
    }

    @Override // p000.id3, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C3804yp) m10565l()).m25229l(true, false);
    }

    @Override // p000.id3, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m10565l();
        layoutInflaterFactory2C3804yp.m25239y();
        z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
        if (z4bVar != null) {
            z4bVar.f70924t = false;
            yua yuaVar = z4bVar.f70923s;
            if (yuaVar != null) {
                yuaVar.m25346a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m10565l().mo16974k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C3804yp) m10565l()).m25239y();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // p000.uc1, android.app.Activity
    public final void setContentView(int i) {
        m22670h();
        m10565l().mo16971h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C3804yp) m10565l()).f70220n0 = i;
    }

    @Override // p000.uc1, android.app.Activity
    public void setContentView(View view) {
        m22670h();
        m10565l().mo16972i(view);
    }

    @Override // p000.uc1, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22670h();
        m10565l().mo16973j(view, layoutParams);
    }
}
