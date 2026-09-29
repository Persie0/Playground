package com.facebook.login.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.C0204c;
import androidx.activity.result.C0206e;
import androidx.activity.result.InterfaceC0208g;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2041a;
import com.clevertap.android.sdk.inapp.DialogInterfaceOnClickListenerC2209b;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginTargetApp;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.C6740a;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.collections.EmptyList;
import p067d8.C5086z;
import p081e0.C5298b1;
import p104f.C5452a;
import p128g2.RunnableC5682t;
import p173i8.C6205a;
import p274n8.C7723h;
import p274n8.C7728m;
import p274n8.C7728m.c;
import p274n8.C7729n;
import p274n8.C7731p;
import p291o7.AbstractC7999i;
import p291o7.C7993c0;
import p291o7.C8004n;
import p291o7.C8012v;
import p291o7.InterfaceC7998h;
import p291o7.InterfaceC8000j;
import p292o8.C8017a;
import p317p7.C8201h;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003|}~B\u001b\b\u0016\u0012\u0006\u0010w\u001a\u00020v\u0012\b\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J'\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0007\"\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\bJ%\u0010\t\u001a\u00020\u00052\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0007\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J'\u0010\n\u001a\u00020\u00052\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0007\"\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\bR.\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u0010<\u001a\b\u0012\u0004\u0012\u000205048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010?\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010\r\u001a\u0004\b>\u0010\u000fR(\u0010F\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010\u000b\u001a\u00020G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010R\u001a\u00020M2\u0006\u0010\u000b\u001a\u00020M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020S2\u0006\u0010\u000b\u001a\u00020S8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010[\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R(\u0010^\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R$\u0010d\u001a\u00020_2\u0006\u0010\u000b\u001a\u00020_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0011\u0010f\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\be\u0010aR\u0014\u0010j\u001a\u00020g8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\b\t\u0010mR\u0018\u0010q\u001a\u00060nR\u00020\u00008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020g8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\br\u0010iR\u0014\u0010u\u001a\u00020g8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bt\u0010i¨\u0006\u007f"}, m13365d2 = {"Lcom/facebook/login/widget/LoginButton;", "Lo7/i;", "", "", "permissions", "Lsl/e;", "setReadPermissions", "", "([Ljava/lang/String;)V", "setPermissions", "setPublishPermissions", "value", "k", "Ljava/lang/String;", "getLoginText", "()Ljava/lang/String;", "setLoginText", "(Ljava/lang/String;)V", "loginText", "l", "getLogoutText", "setLogoutText", "logoutText", "Lcom/facebook/login/widget/LoginButton$a;", "H", "Lcom/facebook/login/widget/LoginButton$a;", "getProperties", "()Lcom/facebook/login/widget/LoginButton$a;", "properties", "Lcom/facebook/login/widget/ToolTipPopup$Style;", "J", "Lcom/facebook/login/widget/ToolTipPopup$Style;", "getToolTipStyle", "()Lcom/facebook/login/widget/ToolTipPopup$Style;", "setToolTipStyle", "(Lcom/facebook/login/widget/ToolTipPopup$Style;)V", "toolTipStyle", "Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "K", "Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "getToolTipMode", "()Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "setToolTipMode", "(Lcom/facebook/login/widget/LoginButton$ToolTipMode;)V", "toolTipMode", "", "L", "getToolTipDisplayTime", "()J", "setToolTipDisplayTime", "(J)V", "toolTipDisplayTime", "Lsl/c;", "Ln8/m;", "O", "Lsl/c;", "getLoginManagerLazy", "()Lsl/c;", "setLoginManagerLazy", "(Lsl/c;)V", "loginManagerLazy", "R", "getLoggerID", "loggerID", "Lo7/h;", "<set-?>", "S", "Lo7/h;", "getCallbackManager", "()Lo7/h;", "callbackManager", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "setDefaultAudience", "(Lcom/facebook/login/DefaultAudience;)V", "defaultAudience", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "setLoginBehavior", "(Lcom/facebook/login/LoginBehavior;)V", "loginBehavior", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "setLoginTargetApp", "(Lcom/facebook/login/LoginTargetApp;)V", "loginTargetApp", "getAuthType", "setAuthType", "authType", "getMessengerPageId", "setMessengerPageId", "messengerPageId", "", "getResetMessengerState", "()Z", "setResetMessengerState", "(Z)V", "resetMessengerState", "getShouldSkipAccountDeduplication", "shouldSkipAccountDeduplication", "", "getLoginButtonContinueLabel", "()I", "loginButtonContinueLabel", "getPermissions", "()Ljava/util/List;", "(Ljava/util/List;)V", "Lcom/facebook/login/widget/LoginButton$b;", "getNewLoginClickListener", "()Lcom/facebook/login/widget/LoginButton$b;", "newLoginClickListener", "getDefaultStyleResource", "defaultStyleResource", "getDefaultRequestCode", "defaultRequestCode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "ToolTipMode", "facebook-login_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class LoginButton extends AbstractC7999i {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f11670U = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final C2334a properties;

    /* JADX INFO: renamed from: I */
    public boolean f11672I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ToolTipPopup.Style toolTipStyle;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ToolTipMode toolTipMode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public long toolTipDisplayTime;

    /* JADX INFO: renamed from: M */
    public ToolTipPopup f11676M;

    /* JADX INFO: renamed from: N */
    public C8017a f11677N;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public InterfaceC9070c<? extends C7728m> loginManagerLazy;

    /* JADX INFO: renamed from: P */
    public Float f11679P;

    /* JADX INFO: renamed from: Q */
    public int f11680Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final String loggerID;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public InterfaceC7998h callbackManager;

    /* JADX INFO: renamed from: T */
    public C0206e f11683T;

    /* JADX INFO: renamed from: j */
    public boolean f11684j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String loginText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String logoutText;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$ToolTipMode, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) from 0x0042: SPUT (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) com.facebook.login.widget.LoginButton.ToolTipMode.DEFAULT com.facebook.login.widget.LoginButton$ToolTipMode
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m13365d2 = {"Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "", "", "toString", "stringValue", "Ljava/lang/String;", "", "intValue", "I", "getIntValue", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "AUTOMATIC", "DISPLAY_ALWAYS", "NEVER_DISPLAY", "facebook-login_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private static final ToolTipMode DEFAULT = new ToolTipMode("automatic", 0);
        private final int intValue;
        private final String stringValue;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$ToolTipMode$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        static {
        }

        private ToolTipMode(String str, int i10) {
            super(str, i);
            this.stringValue = str;
            this.intValue = i10;
        }

        public static ToolTipMode valueOf(String str) {
            C5207g.m11111f(str, "value");
            return (ToolTipMode) Enum.valueOf(ToolTipMode.class, str);
        }

        public static ToolTipMode[] values() {
            ToolTipMode[] toolTipModeArr = $VALUES;
            return (ToolTipMode[]) Arrays.copyOf(toolTipModeArr, toolTipModeArr.length);
        }

        public final int getIntValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$a */
    public static class C2334a {

        /* JADX INFO: renamed from: a */
        public DefaultAudience f11687a = DefaultAudience.FRIENDS;

        /* JADX INFO: renamed from: b */
        public List<String> f11688b = EmptyList.f38032a;

        /* JADX INFO: renamed from: c */
        public LoginBehavior f11689c = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* JADX INFO: renamed from: d */
        public String f11690d = "rerequest";

        /* JADX INFO: renamed from: e */
        public LoginTargetApp f11691e = LoginTargetApp.FACEBOOK;

        /* JADX INFO: renamed from: f */
        public String f11692f;

        /* JADX INFO: renamed from: g */
        public boolean f11693g;
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$b */
    public class ViewOnClickListenerC2335b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoginButton f11694a;

        public ViewOnClickListenerC2335b(LoginButton loginButton) {
            C5207g.m11111f(loginButton, "this$0");
            this.f11694a = loginButton;
        }

        /* JADX INFO: renamed from: a */
        public final C7728m m6740a() {
            LoginTargetApp loginTargetApp;
            LoginButton loginButton = this.f11694a;
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C7728m c7728mM15321a = C7728m.f42275j.m15321a();
                DefaultAudience defaultAudience = loginButton.getDefaultAudience();
                C5207g.m11111f(defaultAudience, "defaultAudience");
                c7728mM15321a.f42279b = defaultAudience;
                LoginBehavior loginBehavior = loginButton.getLoginBehavior();
                C5207g.m11111f(loginBehavior, "loginBehavior");
                c7728mM15321a.f42278a = loginBehavior;
                if (!C6205a.m12742b(this)) {
                    try {
                        loginTargetApp = LoginTargetApp.FACEBOOK;
                    } catch (Throwable th2) {
                        C6205a.m12741a(this, th2);
                        loginTargetApp = null;
                    }
                    C5207g.m11111f(loginTargetApp, "targetApp");
                    c7728mM15321a.f42284g = loginTargetApp;
                    String authType = loginButton.getAuthType();
                    C5207g.m11111f(authType, "authType");
                    c7728mM15321a.f42281d = authType;
                    C6205a.m12742b(this);
                    c7728mM15321a.f42285h = false;
                    c7728mM15321a.f42286i = loginButton.getShouldSkipAccountDeduplication();
                    c7728mM15321a.f42282e = loginButton.getMessengerPageId();
                    c7728mM15321a.f42283f = loginButton.getResetMessengerState();
                    return c7728mM15321a;
                }
                loginTargetApp = null;
                C5207g.m11111f(loginTargetApp, "targetApp");
                c7728mM15321a.f42284g = loginTargetApp;
                String authType2 = loginButton.getAuthType();
                C5207g.m11111f(authType2, "authType");
                c7728mM15321a.f42281d = authType2;
                C6205a.m12742b(this);
                c7728mM15321a.f42285h = false;
                c7728mM15321a.f42286i = loginButton.getShouldSkipAccountDeduplication();
                c7728mM15321a.f42282e = loginButton.getMessengerPageId();
                c7728mM15321a.f42283f = loginButton.getResetMessengerState();
                return c7728mM15321a;
            } catch (Throwable th3) {
                C6205a.m12741a(this, th3);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m6741b() {
            LoginButton loginButton = this.f11694a;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C7728m c7728mM6740a = m6740a();
                C0206e c0206e = loginButton.f11683T;
                if (c0206e != null) {
                    C7728m.c cVar = (C7728m.c) c0206e.f519b;
                    InterfaceC7998h callbackManager = loginButton.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new CallbackManagerImpl();
                    }
                    cVar.f42288a = callbackManager;
                    c0206e.mo844a(loginButton.getProperties().f11688b);
                    return;
                }
                if (loginButton.getFragment() != null) {
                    Fragment fragment = loginButton.getFragment();
                    if (fragment == null) {
                        return;
                    }
                    List<String> list = loginButton.getProperties().f11688b;
                    String loggerID = loginButton.getLoggerID();
                    c7728mM6740a.getClass();
                    c7728mM6740a.m15316d(new C5298b1(fragment), list, loggerID);
                    return;
                }
                if (loginButton.getNativeFragment() != null) {
                    android.app.Fragment nativeFragment = loginButton.getNativeFragment();
                    if (nativeFragment == null) {
                        return;
                    }
                    List<String> list2 = loginButton.getProperties().f11688b;
                    String loggerID2 = loginButton.getLoggerID();
                    c7728mM6740a.getClass();
                    c7728mM6740a.m15316d(new C5298b1(nativeFragment), list2, loggerID2);
                    return;
                }
                Activity activity = loginButton.getActivity();
                List<String> list3 = loginButton.getProperties().f11688b;
                String loggerID3 = loginButton.getLoggerID();
                c7728mM6740a.getClass();
                C5207g.m11111f(activity, "activity");
                LoginClient.Request requestM15315a = c7728mM6740a.m15315a(new C7723h(list3));
                if (loggerID3 != null) {
                    requestM15315a.f11623e = loggerID3;
                }
                c7728mM6740a.m15319h(new C7728m.a(activity), requestM15315a);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m6742c(Context context) {
            String string;
            LoginButton loginButton = this.f11694a;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C7728m c7728mM6740a = m6740a();
                if (!loginButton.f11684j) {
                    c7728mM6740a.m15317e();
                    return;
                }
                String string2 = loginButton.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                C5207g.m11110e(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                String string3 = loginButton.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                C5207g.m11110e(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                Profile profile = C8012v.f43591d.m15888a().f43595c;
                if ((profile == null ? null : profile.f11472e) != null) {
                    String string4 = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                    C5207g.m11110e(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{profile.f11472e}, 1));
                    C5207g.m11110e(string, "java.lang.String.format(format, *args)");
                } else {
                    string = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                    C5207g.m11110e(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterfaceOnClickListenerC2209b(1, c7728mM6740a)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LoginButton loginButton = this.f11694a;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C5207g.m11111f(view, "v");
                int i10 = LoginButton.f11670U;
                loginButton.getClass();
                if (!C6205a.m12742b(loginButton)) {
                    try {
                        View.OnClickListener onClickListener = loginButton.f43541c;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(loginButton, th2);
                    }
                }
                Date date = AccessToken.f11370l;
                AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                boolean zM6596c = AccessToken.C2262b.m6596c();
                if (zM6596c) {
                    Context context = loginButton.getContext();
                    C5207g.m11110e(context, "context");
                    m6742c(context);
                } else {
                    m6741b();
                }
                C8201h c8201h = new C8201h(loginButton.getContext(), (String) null);
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", accessTokenM6595b != null ? 0 : 1);
                bundle.putInt("access_token_expired", zM6596c ? 1 : 0);
                C8004n c8004n = C8004n.f43550a;
                if (C7993c0.m15849b()) {
                    c8201h.m16334f("fb_login_view_usage", bundle);
                }
            } catch (Throwable th3) {
                C6205a.m12741a(this, th3);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$c */
    public /* synthetic */ class C2336c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11695a;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            iArr[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            f11695a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.properties = new C2334a();
        this.toolTipStyle = ToolTipPopup.Style.BLUE;
        ToolTipMode.INSTANCE.getClass();
        this.toolTipMode = ToolTipMode.DEFAULT;
        this.toolTipDisplayTime = 6000L;
        this.loginManagerLazy = C6740a.m13372a(new InterfaceC2041a<C7728m>() { // from class: com.facebook.login.widget.LoginButton$loginManagerLazy$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C7728m mo807E() {
                return C7728m.f42275j.m15321a();
            }
        });
        this.f11680Q = 255;
        String string = UUID.randomUUID().toString();
        C5207g.m11110e(string, "randomUUID().toString()");
        this.loggerID = string;
    }

    @Override // p291o7.AbstractC7999i
    /* JADX INFO: renamed from: a */
    public final void mo6732a(Context context, AttributeSet attributeSet, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(context, "context");
            super.mo6732a(context, attributeSet, i10);
            setInternalOnClickListener(getNewLoginClickListener());
            m6736i(context, attributeSet, i10);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.f11677N = new C8017a(this);
            }
            m6739l();
            m6738k();
            if (!C6205a.m12742b(this)) {
                try {
                    getBackground().setAlpha(this.f11680Q);
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                setCompoundDrawablesWithIntrinsicBounds(C5452a.m11672a(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th3) {
                C6205a.m12741a(this, th3);
            }
        } catch (Throwable th4) {
            C6205a.m12741a(this, th4);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6733f() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            int i10 = C2336c.f11695a[this.toolTipMode.ordinal()];
            if (i10 == 1) {
                C5086z c5086z = C5086z.f33015a;
                C8004n.m15873c().execute(new RunnableC5682t(C5086z.m10832q(getContext()), 6, this));
            } else {
                if (i10 != 2) {
                    return;
                }
                String string = getResources().getString(R.string.com_facebook_tooltip_default);
                C5207g.m11110e(string, "resources.getString(R.string.com_facebook_tooltip_default)");
                m6734g(string);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6734g(String str) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(this, str);
            ToolTipPopup.Style style = this.toolTipStyle;
            if (!C6205a.m12742b(toolTipPopup)) {
                try {
                    C5207g.m11111f(style, "style");
                    toolTipPopup.f11702f = style;
                } catch (Throwable th2) {
                    C6205a.m12741a(toolTipPopup, th2);
                }
            }
            long j10 = this.toolTipDisplayTime;
            if (!C6205a.m12742b(toolTipPopup)) {
                try {
                    toolTipPopup.f11703g = j10;
                } catch (Throwable th3) {
                    C6205a.m12741a(toolTipPopup, th3);
                }
            }
            toolTipPopup.m6744b();
            this.f11676M = toolTipPopup;
        } catch (Throwable th4) {
            C6205a.m12741a(this, th4);
        }
    }

    public final String getAuthType() {
        return this.properties.f11690d;
    }

    public final InterfaceC7998h getCallbackManager() {
        return this.callbackManager;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.properties.f11687a;
    }

    @Override // p291o7.AbstractC7999i
    public int getDefaultRequestCode() {
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return 0;
        }
    }

    @Override // p291o7.AbstractC7999i
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.loggerID;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.properties.f11689c;
    }

    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public final InterfaceC9070c<C7728m> getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.properties.f11691e;
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final String getLogoutText() {
        return this.logoutText;
    }

    public final String getMessengerPageId() {
        return this.properties.f11692f;
    }

    public ViewOnClickListenerC2335b getNewLoginClickListener() {
        return new ViewOnClickListenerC2335b(this);
    }

    public final List<String> getPermissions() {
        return this.properties.f11688b;
    }

    public final C2334a getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.f11693g;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        this.properties.getClass();
        return false;
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public final ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    /* JADX INFO: renamed from: h */
    public final int m6735h(String str) {
        int iCeil;
        if (C6205a.m12742b(this)) {
            return 0;
        }
        try {
            if (!C6205a.m12742b(this)) {
                try {
                    iCeil = (int) Math.ceil(getPaint().measureText(str));
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                    iCeil = 0;
                }
                return getCompoundPaddingLeft() + getCompoundDrawablePadding() + iCeil + getCompoundPaddingRight();
            }
            iCeil = 0;
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + iCeil + getCompoundPaddingRight();
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6736i(Context context, AttributeSet attributeSet, int i10) {
        ToolTipMode toolTipMode;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(context, "context");
            ToolTipMode.INSTANCE.getClass();
            this.toolTipMode = ToolTipMode.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7731p.f42299a, 0, i10);
            C5207g.m11110e(typedArrayObtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            try {
                this.f11684j = typedArrayObtainStyledAttributes.getBoolean(0, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(3));
                setLogoutText(typedArrayObtainStyledAttributes.getString(4));
                int i11 = typedArrayObtainStyledAttributes.getInt(5, ToolTipMode.DEFAULT.getIntValue());
                ToolTipMode[] toolTipModeArrValues = ToolTipMode.values();
                int length = toolTipModeArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        toolTipMode = null;
                        break;
                    }
                    toolTipMode = toolTipModeArrValues[i12];
                    if (toolTipMode.getIntValue() == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (toolTipMode == null) {
                    ToolTipMode.INSTANCE.getClass();
                    toolTipMode = ToolTipMode.DEFAULT;
                }
                this.toolTipMode = toolTipMode;
                if (typedArrayObtainStyledAttributes.hasValue(1)) {
                    this.f11679P = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(2, 255);
                this.f11680Q = integer;
                int iMax = Math.max(0, integer);
                this.f11680Q = iMax;
                this.f11680Q = Math.min(255, iMax);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m6737j(InterfaceC7998h interfaceC7998h, final InterfaceC8000j<C7729n> interfaceC8000j) {
        final C7728m value = this.loginManagerLazy.getValue();
        value.getClass();
        if (!(interfaceC7998h instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        ((CallbackManagerImpl) interfaceC7998h).f11545a.put(Integer.valueOf(requestCode), new CallbackManagerImpl.InterfaceC2300a() { // from class: n8.l
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC2300a
            /* JADX INFO: renamed from: a */
            public final void mo6663a(Intent intent, int i10) {
                C7728m c7728m = value;
                C5207g.m11111f(c7728m, "this$0");
                c7728m.m15318g(i10, intent, interfaceC8000j);
            }
        });
        InterfaceC7998h interfaceC7998h2 = this.callbackManager;
        if (interfaceC7998h2 == null) {
            this.callbackManager = interfaceC7998h;
        } else {
            if (interfaceC7998h2 != interfaceC7998h) {
                Log.w("com.facebook.login.widget.LoginButton", "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
            }
        }
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: k */
    public final void m6738k() {
        int stateCount;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Float f3 = this.f11679P;
            if (f3 == null) {
                return;
            }
            float fFloatValue = f3.floatValue();
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable) && (stateCount = ((StateListDrawable) background).getStateCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                    GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(fFloatValue);
                    }
                    if (i11 >= stateCount) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(fFloatValue);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6739l() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                Date date = AccessToken.f11370l;
                if (AccessToken.C2262b.m6596c()) {
                    String string = this.logoutText;
                    if (string == null) {
                        string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                    }
                    setText(string);
                    return;
                }
            }
            String str = this.loginText;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            C5207g.m11110e(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && m6735h(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
                C5207g.m11110e(string2, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p291o7.AbstractC7999i, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        boolean z10;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof InterfaceC0208g) {
                Object context = getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                AbstractC0207f abstractC0207fMo793k = ((InterfaceC0208g) context).mo793k();
                C7728m value = this.loginManagerLazy.getValue();
                InterfaceC7998h interfaceC7998h = this.callbackManager;
                String str = this.loggerID;
                value.getClass();
                this.f11683T = abstractC0207fMo793k.m868d("facebook-login", value.new c(interfaceC7998h, str), new C0204c());
            }
            C8017a c8017a = this.f11677N;
            if (c8017a != null && (z10 = c8017a.f43532c)) {
                if (!z10) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    c8017a.f43531b.m19282b(c8017a.f43530a, intentFilter);
                    c8017a.f43532c = true;
                }
                m6739l();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            C0206e c0206e = this.f11683T;
            if (c0206e != null) {
                c0206e.m865b();
            }
            C8017a c8017a = this.f11677N;
            if (c8017a != null && c8017a.f43532c) {
                c8017a.f43531b.m19284d(c8017a.f43530a);
                c8017a.f43532c = false;
            }
            ToolTipPopup toolTipPopup = this.f11676M;
            if (toolTipPopup != null) {
                toolTipPopup.m6743a();
            }
            this.f11676M = null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // p291o7.AbstractC7999i, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(canvas, "canvas");
            super.onDraw(canvas);
            if (!this.f11672I && !isInEditMode()) {
                this.f11672I = true;
                m6733f();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            super.onLayout(z10, i10, i11, i12, i13);
            m6739l();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iM6735h = 0;
            if (!C6205a.m12742b(this)) {
                try {
                    Resources resources2 = getResources();
                    String string = this.loginText;
                    if (string == null) {
                        string = resources2.getString(R.string.com_facebook_loginview_log_in_button_continue);
                        int iM6735h2 = m6735h(string);
                        if (View.resolveSize(iM6735h2, i10) < iM6735h2) {
                            string = resources2.getString(R.string.com_facebook_loginview_log_in_button);
                        }
                    }
                    iM6735h = m6735h(string);
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
            String string2 = this.logoutText;
            if (string2 == null) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
                C5207g.m11110e(string2, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(iM6735h, m6735h(string2)), i10), compoundPaddingTop);
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(view, "changedView");
            super.onVisibilityChanged(view, i10);
            if (i10 != 0) {
                ToolTipPopup toolTipPopup = this.f11676M;
                if (toolTipPopup != null) {
                    toolTipPopup.m6743a();
                }
                this.f11676M = null;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    public final void setAuthType(String str) {
        C5207g.m11111f(str, "value");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11690d = str;
    }

    public final void setDefaultAudience(DefaultAudience defaultAudience) {
        C5207g.m11111f(defaultAudience, "value");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11687a = defaultAudience;
    }

    public final void setLoginBehavior(LoginBehavior loginBehavior) {
        C5207g.m11111f(loginBehavior, "value");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11689c = loginBehavior;
    }

    public final void setLoginManagerLazy(InterfaceC9070c<? extends C7728m> interfaceC9070c) {
        C5207g.m11111f(interfaceC9070c, "<set-?>");
        this.loginManagerLazy = interfaceC9070c;
    }

    public final void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        C5207g.m11111f(loginTargetApp, "value");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11691e = loginTargetApp;
    }

    public final void setLoginText(String str) {
        this.loginText = str;
        m6739l();
    }

    public final void setLogoutText(String str) {
        this.logoutText = str;
        m6739l();
    }

    public final void setMessengerPageId(String str) {
        this.properties.f11692f = str;
    }

    public final void setPermissions(List<String> list) {
        C5207g.m11111f(list, "value");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = list;
    }

    public final void setPermissions(String... permissions) {
        C5207g.m11111f(permissions, "permissions");
        Object[] objArrCopyOf = Arrays.copyOf(permissions, permissions.length);
        C5207g.m11111f(objArrCopyOf, "elements");
        ArrayList arrayListM13378j0 = C6744b.m13378j0(objArrCopyOf);
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = arrayListM13378j0;
    }

    public final void setPublishPermissions(List<String> list) {
        C5207g.m11111f(list, "permissions");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = list;
    }

    public final void setPublishPermissions(String... permissions) {
        C5207g.m11111f(permissions, "permissions");
        Object[] objArrCopyOf = Arrays.copyOf(permissions, permissions.length);
        C5207g.m11111f(objArrCopyOf, "elements");
        ArrayList arrayListM13378j0 = C6744b.m13378j0(objArrCopyOf);
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = arrayListM13378j0;
    }

    public final void setReadPermissions(List<String> list) {
        C5207g.m11111f(list, "permissions");
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = list;
    }

    public final void setReadPermissions(String... permissions) {
        C5207g.m11111f(permissions, "permissions");
        Object[] objArrCopyOf = Arrays.copyOf(permissions, permissions.length);
        C5207g.m11111f(objArrCopyOf, "elements");
        ArrayList arrayListM13378j0 = C6744b.m13378j0(objArrCopyOf);
        C2334a c2334a = this.properties;
        c2334a.getClass();
        c2334a.f11688b = arrayListM13378j0;
    }

    public final void setResetMessengerState(boolean z10) {
        this.properties.f11693g = z10;
    }

    public final void setToolTipDisplayTime(long j10) {
        this.toolTipDisplayTime = j10;
    }

    public final void setToolTipMode(ToolTipMode toolTipMode) {
        C5207g.m11111f(toolTipMode, "<set-?>");
        this.toolTipMode = toolTipMode;
    }

    public final void setToolTipStyle(ToolTipPopup.Style style) {
        C5207g.m11111f(style, "<set-?>");
        this.toolTipStyle = style;
    }
}
