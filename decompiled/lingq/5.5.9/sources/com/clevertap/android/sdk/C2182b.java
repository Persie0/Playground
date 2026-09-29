package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import cm.InterfaceC2041a;
import com.clevertap.android.sdk.C2182b;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.DialogInterfaceOnClickListenerC2209b;
import com.linguist.R;
import dm.C5207g;
import java.util.Objects;
import kotlin.collections.C6744b;
import p232l2.C7222a;
import p254m2.C7472a;
import p290o6.C7966l;
import p290o6.C7968m;
import p290o6.C7986y;
import sl.C9072e;

/* JADX INFO: renamed from: com.clevertap.android.sdk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2182b {

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f11018a;

    /* JADX INFO: renamed from: b */
    public boolean f11019b;

    /* JADX INFO: renamed from: c */
    public final Activity f11020c;

    /* JADX INFO: renamed from: d */
    public boolean f11021d = false;

    public C2182b(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f11020c = activity;
        this.f11018a = cleverTapInstanceConfig;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [o6.m0] */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public final void m6463a(boolean z10, InAppNotificationActivity.InterfaceC2180e interfaceC2180e) {
        Activity activity = this.f11020c;
        C5207g.m11111f(activity, "<this>");
        if (Build.VERSION.SDK_INT > 32 && activity.getApplicationContext().getApplicationInfo().targetSdkVersion > 32) {
            this.f11019b = z10;
            if (C7472a.m14841a(activity, "android.permission.POST_NOTIFICATIONS") != -1) {
                interfaceC2180e.mo6448d();
                if (activity instanceof InAppNotificationActivity) {
                    ((InAppNotificationActivity) activity).m6440O(null);
                    return;
                }
                return;
            }
            C7966l.m15803a(activity, this.f11018a);
            boolean z11 = C7966l.f43364c;
            Activity activityM15846k0 = C7986y.m15846k0();
            Objects.requireNonNull(activityM15846k0);
            boolean zM14546d = C7222a.m14546d(activityM15846k0, "android.permission.POST_NOTIFICATIONS");
            if (z11 || !zM14546d || !this.f11019b) {
                C7222a.m14545c(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 102);
                return;
            }
            final ?? r13 = new InterfaceC2041a() { // from class: o6.m0
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object mo807E() {
                    C2182b c2182b = this.f43385a;
                    c2182b.getClass();
                    boolean z12 = C7979r0.f43406a;
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    Activity activity2 = c2182b.f11020c;
                    intent.putExtra("android.provider.extra.APP_PACKAGE", activity2.getPackageName());
                    intent.addFlags(268435456);
                    activity2.startActivity(intent);
                    c2182b.f11021d = true;
                    return C9072e.f47360a;
                }
            };
            InterfaceC2041a interfaceC2041a = new InterfaceC2041a() { // from class: o6.n0
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object mo807E() {
                    Activity activity2 = this.f43388a.f11020c;
                    if (activity2 instanceof InAppNotificationActivity) {
                        ((InAppNotificationActivity) activity2).m6440O(null);
                    }
                    return C9072e.f47360a;
                }
            };
            Context applicationContext = activity.getApplicationContext();
            C5207g.m11110e(applicationContext, "activity.applicationContext");
            C7968m c7968m = new C7968m(applicationContext, R.string.ct_permission_not_available_title, R.string.ct_permission_not_available_message, R.string.ct_permission_not_available_open_settings_option, R.string.ct_txt_cancel);
            String str = (String) C6744b.m13383o0(0, (String[]) c7968m.f43384b);
            String str2 = (String) C6744b.m13383o0(1, (String[]) c7968m.f43384b);
            new AlertDialog.Builder(activity, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(str).setMessage(str2).setPositiveButton((String) C6744b.m13383o0(2, (String[]) c7968m.f43384b), new DialogInterface.OnClickListener() { // from class: com.clevertap.android.sdk.inapp.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    InterfaceC2041a interfaceC2041a2 = r13;
                    C5207g.m11111f(interfaceC2041a2, "$onAccept");
                    interfaceC2041a2.mo807E();
                }
            }).setNegativeButton((String) C6744b.m13383o0(3, (String[]) c7968m.f43384b), new DialogInterfaceOnClickListenerC2209b(0, interfaceC2041a)).show();
        }
    }
}
