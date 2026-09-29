package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.source.C0717b;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.collect.AbstractC1102r;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.lingq.core.player.service.PlayerService;
import com.lingq.feature.playlist.C2251a;
import com.lingq.feature.playlist.C2255e;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class gv5 implements zr2, a35, jx2, nt8 {

    /* JADX INFO: renamed from: e */
    public static int f41386e;

    /* JADX INFO: renamed from: g */
    public static final gh5 f41388g;

    /* JADX INFO: renamed from: h */
    public static final gh5 f41389h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41391a;

    /* JADX INFO: renamed from: b */
    public Object f41392b;

    /* JADX INFO: renamed from: c */
    public Object f41393c;

    /* JADX INFO: renamed from: d */
    public Object f41394d;

    /* JADX INFO: renamed from: f */
    public static final Object f41387f = new Object();

    /* JADX INFO: renamed from: i */
    public static final rlb f41390i = new rlb(7);

    static {
        long j = -9223372036854775807L;
        f41388g = new gh5(2, j);
        f41389h = new gh5(3, j);
    }

    public gv5(Collection collection) {
        ArrayList arrayListM22603U0;
        this.f41391a = 21;
        String string = UUID.randomUUID().toString();
        string.getClass();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(86) + 43;
        Iterable vu0Var = new vu0('a', 'z');
        vu0 vu0Var2 = new vu0('A', 'Z');
        if (vu0Var instanceof Collection) {
            arrayListM22603U0 = u91.m22603U0(vu0Var2, (Collection) vu0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            u91.m22630w0(vu0Var, arrayList);
            u91.m22630w0(vu0Var2, arrayList);
            arrayListM22603U0 = arrayList;
        }
        ArrayList arrayListM22604V0 = u91.m22604V0(u91.m22604V0(u91.m22604V0(u91.m22604V0(u91.m22603U0(new vu0('0', '9'), arrayListM22603U0), '-'), '.'), '_'), '~');
        ArrayList arrayList2 = new ArrayList(iNextInt);
        for (int i = 0; i < iNextInt; i++) {
            Character ch = (Character) arrayListM22604V0.get(secureRandom.nextInt(arrayListM22604V0.size()));
            ch.getClass();
            arrayList2.add(ch);
        }
        String strM22596N0 = u91.m22596N0(arrayList2, "", null, null, null, 62);
        if (!(string.length() != 0 ? !(vk9.m23388k0(string, ' ', 0, 6) >= 0) : false) || !bzb.m4242b(strM22596N0)) {
            C3386nv.m17626m("Failed requirement.");
            throw null;
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        setUnmodifiableSet.getClass();
        this.f41392b = setUnmodifiableSet;
        this.f41393c = string;
        this.f41394d = strM22596N0;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m12868E(wq2 wq2Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                sda[] sdaVarArr = (sda[]) editable.getSpans(selectionStart, iMin, sda.class);
                if (sdaVarArr != null && sdaVarArr.length > 0) {
                    for (sda sdaVar : sdaVarArr) {
                        int spanStart = editable.getSpanStart(sdaVar);
                        int spanEnd = editable.getSpanEnd(sdaVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    wq2Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    wq2Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public static Bundle m12869c0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m12871x(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m12870w(Editable editable, KeyEvent keyEvent, boolean z) {
        sda[] sdaVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (sdaVarArr = (sda[]) editable.getSpans(selectionStart, selectionEnd, sda.class)) != null && sdaVarArr.length > 0) {
                for (sda sdaVar : sdaVarArr) {
                    int spanStart = editable.getSpanStart(sdaVar);
                    int spanEnd = editable.getSpanEnd(sdaVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static void m12871x(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(gv5.class.getClassLoader());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public int m12872A(int i, String str) {
        if (i < 0 || i >= str.length()) {
            return -1;
        }
        if (str instanceof Spanned) {
            Spanned spanned = (Spanned) str;
            sda[] sdaVarArr = (sda[]) spanned.getSpans(i, i + 1, sda.class);
            if (sdaVarArr.length > 0) {
                return spanned.getSpanEnd(sdaVarArr[0]);
            }
        }
        return ((br2) m12880J(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new br2(i))).f8887c;
    }

    /* JADX INFO: renamed from: B */
    public int m12873B(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            sda[] sdaVarArr = (sda[]) spanned.getSpans(i, i + 1, sda.class);
            if (sdaVarArr.length > 0) {
                return spanned.getSpanStart(sdaVarArr[0]);
            }
        }
        return ((br2) m12880J(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new br2(i))).f8886b;
    }

    /* JADX INFO: renamed from: C */
    public String m12874C() {
        return (String) this.f41393c;
    }

    /* JADX INFO: renamed from: D */
    public Set m12875D() {
        return (Set) this.f41392b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:103:0x0277  */
    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:108:0x028f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0294  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x0300  */
    /* JADX WARN: Code duplicated, block: B:135:0x0319  */
    /* JADX WARN: Code duplicated, block: B:136:0x031b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0349  */
    /* JADX WARN: Code duplicated, block: B:144:0x0378  */
    /* JADX WARN: Code duplicated, block: B:149:0x038e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0391  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03be  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:174:0x0420  */
    /* JADX WARN: Code duplicated, block: B:177:0x042e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0430  */
    /* JADX WARN: Code duplicated, block: B:180:0x0436  */
    /* JADX WARN: Code duplicated, block: B:182:0x044f  */
    /* JADX WARN: Code duplicated, block: B:185:0x045b  */
    /* JADX WARN: Code duplicated, block: B:188:0x046c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0476  */
    /* JADX WARN: Code duplicated, block: B:195:0x048e  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:209:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:214:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:215:0x04f6 A[Catch: ExecutionException -> 0x051e, TimeoutException -> 0x0520, InterruptedException -> 0x0529, TryCatch #8 {InterruptedException -> 0x0529, ExecutionException -> 0x051e, TimeoutException -> 0x0520, blocks: (B:212:0x04e3, B:216:0x04fe, B:220:0x0512, B:219:0x050a, B:215:0x04f6), top: B:245:0x04e3 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0507  */
    /* JADX WARN: Code duplicated, block: B:219:0x050a A[Catch: ExecutionException -> 0x051e, TimeoutException -> 0x0520, InterruptedException -> 0x0529, TryCatch #8 {InterruptedException -> 0x0529, ExecutionException -> 0x051e, TimeoutException -> 0x0520, blocks: (B:212:0x04e3, B:216:0x04fe, B:220:0x0512, B:219:0x050a, B:215:0x04f6), top: B:245:0x04e3 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0555  */
    /* JADX WARN: Code duplicated, block: B:233:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x04e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:99:0x025a  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0436, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:209:0x04cd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /* JADX INFO: renamed from: F */
    public boolean m12876F() {
        pz3 pz3Var;
        Bundle bundle;
        int identifier;
        String strM23868E;
        Uri defaultUri;
        String strM23868E2;
        String strM23868E3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strM23868E4;
        Integer numValueOf;
        String strM23868E5;
        Integer numM23885v;
        Integer numM23885v2;
        Integer numM23885v3;
        Long lM23864A;
        long[] jArrM23869F;
        int[] iArrM23887x;
        boolean zM23880o;
        ?? r0;
        ?? r1;
        Notification notification;
        String strM23868E6;
        Bitmap bitmap;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z;
        int i;
        int i2;
        int i3;
        int identifier2;
        String string;
        int i4 = 1;
        if (((web) this.f41394d).m23880o("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f41393c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strM23868E7 = ((web) this.f41394d).m23868E("gcm.n.image");
        if (TextUtils.isEmpty(strM23868E7)) {
            pz3Var = null;
        } else {
            try {
                pz3Var = new pz3(new URL(strM23868E7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strM23868E7);
                pz3Var = null;
            }
        }
        if (pz3Var != null) {
            ExecutorService executorService = (ExecutorService) this.f41392b;
            wr9 wr9Var = new wr9();
            pz3Var.f57028b = executorService.submit(new RunnableC0806bd(22, pz3Var, wr9Var));
            pz3Var.f57029c = wr9Var.f67208a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f41393c;
        web webVar = (web) this.f41394d;
        AtomicInteger atomicInteger = lb1.f49389a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle3 = bundle;
        String strM23868E8 = webVar.m23868E("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strM23868E8 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strM23868E8)) {
                    strM23868E8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM23868E8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM23868E8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM23868E8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strM23868E8) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strM23868E8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strM23868E8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM23868E8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM23868E8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM23868E8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = lb1.f49389a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        vm6 vm6Var = new vm6(firebaseMessagingService2, strM23868E8);
        String strM23865B = webVar.m23865B(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM23865B)) {
            vm6Var.m23417i(strM23865B);
        }
        String strM23865B2 = webVar.m23865B(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM23865B2)) {
            vm6Var.m23416h(strM23865B2);
            um6 um6Var = new um6();
            um6Var.f64076d = vm6.m23410d(strM23865B2);
            vm6Var.m23423o(um6Var);
        }
        String strM23868E9 = webVar.m23868E("gcm.n.icon");
        if (!TextUtils.isEmpty(strM23868E9)) {
            identifier = resources.getIdentifier(strM23868E9, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strM23868E9, "mipmap", packageName)) == 0) {
                Log.w("FirebaseMessaging", "Icon resource " + strM23868E9 + " not found. Notification will use default icon.");
            } else {
                i4 = 1;
            }
            vm6Var.f65600t.icon = identifier;
            strM23868E = webVar.m23868E("gcm.n.sound2");
            if (TextUtils.isEmpty(strM23868E)) {
                strM23868E = webVar.m23868E("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strM23868E)) {
                defaultUri = null;
            } else if (!"default".equals(strM23868E) || resources.getIdentifier(strM23868E, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM23868E);
            }
            if (defaultUri != null) {
                vm6Var.m23422n(defaultUri);
            }
            strM23868E2 = webVar.m23868E("gcm.n.click_action");
            if (TextUtils.isEmpty(strM23868E2)) {
                strM23868E3 = webVar.m23868E("gcm.n.link_android");
                if (TextUtils.isEmpty(strM23868E3)) {
                    strM23868E3 = webVar.m23868E("gcm.n.link");
                }
                if (TextUtils.isEmpty(strM23868E3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strM23868E3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strM23868E2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) webVar.f66742a;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (webVar.m23880o("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", webVar.m23873K());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            vm6Var.f65587g = activity;
            if (webVar.m23880o("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(webVar.m23873K())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                vm6Var.f65600t.deleteIntent = broadcast;
            }
            strM23868E4 = webVar.m23868E("gcm.n.color");
            if (TextUtils.isEmpty(strM23868E4)) {
                i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strM23868E4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strM23868E4 + ". Notification will use default color.");
                    i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i3 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                vm6Var.f65595o = numValueOf.intValue();
            }
            vm6Var.m23413e(!webVar.m23880o("gcm.n.sticky"));
            vm6Var.f65593m = webVar.m23880o("gcm.n.local_only");
            strM23868E5 = webVar.m23868E("gcm.n.ticker");
            if (strM23868E5 != null) {
                vm6Var.m23424p(strM23868E5);
            }
            numM23885v = webVar.m23885v("gcm.n.notification_priority");
            if (numM23885v == null) {
                numM23885v = null;
            } else if (numM23885v.intValue() >= -2 || numM23885v.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM23885v + ". Skipping setting notificationPriority.");
                numM23885v = null;
            }
            if (numM23885v != null) {
                vm6Var.f65590j = numM23885v.intValue();
            }
            numM23885v2 = webVar.m23885v("gcm.n.visibility");
            if (numM23885v2 == null) {
                numM23885v2 = null;
            } else if (numM23885v2.intValue() >= -1 || numM23885v2.intValue() > i4) {
                Log.w("NotificationParams", "visibility is invalid: " + numM23885v2 + ". Skipping setting visibility.");
                numM23885v2 = null;
            }
            if (numM23885v2 != null) {
                vm6Var.f65596p = numM23885v2.intValue();
            }
            numM23885v3 = webVar.m23885v("gcm.n.notification_count");
            if (numM23885v3 != null) {
                numM23885v3 = null;
            } else if (numM23885v3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM23885v3 + ". Skipping setting notificationCount.");
                numM23885v3 = null;
            }
            if (numM23885v3 != null) {
                vm6Var.f65589i = numM23885v3.intValue();
            }
            lM23864A = webVar.m23864A();
            if (lM23864A != null) {
                vm6Var.f65591k = true;
                vm6Var.f65600t.when = lM23864A.longValue();
            }
            jArrM23869F = webVar.m23869F();
            if (jArrM23869F != null) {
                vm6Var.f65600t.vibrate = jArrM23869F;
            }
            iArrM23887x = webVar.m23887x();
            if (iArrM23887x != null) {
                int i5 = iArrM23887x[0];
                i = iArrM23887x[1];
                int i6 = iArrM23887x[2];
                Notification notification2 = vm6Var.f65600t;
                notification2.ledARGB = i5;
                notification2.ledOnMS = i;
                notification2.ledOffMS = i6;
                if (i != 0 || i6 == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                notification2.flags = i2 | ((-2) & notification2.flags);
            }
            zM23880o = webVar.m23880o("gcm.n.default_sound");
            r0 = zM23880o;
            if (webVar.m23880o("gcm.n.default_vibrate_timings")) {
                r0 = (zM23880o ? 1 : 0) | 2;
            }
            r1 = r0;
            if (webVar.m23880o("gcm.n.default_light_settings")) {
                r1 = (r0 == true ? 1 : 0) | 4;
            }
            notification = vm6Var.f65600t;
            notification.defaults = r1;
            if ((r1 & 4) != 0) {
                notification.flags |= 1;
            }
            strM23868E6 = webVar.m23868E("gcm.n.tag");
            if (TextUtils.isEmpty(strM23868E6)) {
                strM23868E6 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strM23868E6;
            if (pz3Var != null) {
                try {
                    tld tldVar = pz3Var.f57029c;
                    lda.m16130p(tldVar);
                    bitmap = (Bitmap) Tasks.await(tldVar, 5L, TimeUnit.SECONDS);
                    if (bitmap == null) {
                        iconCompat = null;
                    } else {
                        iconCompat = new IconCompat(1);
                        iconCompat.f5505b = bitmap;
                    }
                    vm6Var.f65588h = iconCompat;
                    tm6 tm6Var = new tm6();
                    if (bitmap == null) {
                        iconCompat2 = null;
                        z = true;
                    } else {
                        z = true;
                        iconCompat2 = new IconCompat(1);
                        iconCompat2.f5505b = bitmap;
                    }
                    tm6Var.f62527d = iconCompat2;
                    tm6Var.f62528e = null;
                    tm6Var.f62529f = z;
                    vm6Var.m23423o(tm6Var);
                } catch (InterruptedException unused5) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    pz3Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e2) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                } catch (TimeoutException unused6) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    pz3Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f41393c).getSystemService("notification")).notify(str2, 0, vm6Var.mo15108c());
            return true;
        }
        int i7 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0) {
            try {
                i7 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
            }
        }
        identifier = i7 != 0 ? i7 : 17301651;
        vm6Var.f65600t.icon = identifier;
        strM23868E = webVar.m23868E("gcm.n.sound2");
        if (TextUtils.isEmpty(strM23868E)) {
            strM23868E = webVar.m23868E("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM23868E)) {
            defaultUri = null;
        } else if ("default".equals(strM23868E)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            vm6Var.m23422n(defaultUri);
        }
        strM23868E2 = webVar.m23868E("gcm.n.click_action");
        if (TextUtils.isEmpty(strM23868E2)) {
            launchIntentForPackage = new Intent(strM23868E2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strM23868E3 = webVar.m23868E("gcm.n.link_android");
            if (TextUtils.isEmpty(strM23868E3)) {
                strM23868E3 = webVar.m23868E("gcm.n.link");
            }
            if (TextUtils.isEmpty(strM23868E3)) {
                uri = Uri.parse(strM23868E3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) webVar.f66742a;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (webVar.m23880o("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", webVar.m23873K());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        vm6Var.f65587g = activity;
        if (webVar.m23880o("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(webVar.m23873K())), 1140850688);
        }
        if (broadcast != null) {
            vm6Var.f65600t.deleteIntent = broadcast;
        }
        strM23868E4 = webVar.m23868E("gcm.n.color");
        if (TextUtils.isEmpty(strM23868E4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strM23868E4));
        } else {
            i3 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i3));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            vm6Var.f65595o = numValueOf.intValue();
        }
        vm6Var.m23413e(!webVar.m23880o("gcm.n.sticky"));
        vm6Var.f65593m = webVar.m23880o("gcm.n.local_only");
        strM23868E5 = webVar.m23868E("gcm.n.ticker");
        if (strM23868E5 != null) {
            vm6Var.m23424p(strM23868E5);
        }
        numM23885v = webVar.m23885v("gcm.n.notification_priority");
        if (numM23885v == null) {
            if (numM23885v.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM23885v + ". Skipping setting notificationPriority.");
            numM23885v = null;
        } else {
            numM23885v = null;
        }
        if (numM23885v != null) {
            vm6Var.f65590j = numM23885v.intValue();
        }
        numM23885v2 = webVar.m23885v("gcm.n.visibility");
        if (numM23885v2 == null) {
            if (numM23885v2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numM23885v2 + ". Skipping setting visibility.");
            numM23885v2 = null;
        } else {
            numM23885v2 = null;
        }
        if (numM23885v2 != null) {
            vm6Var.f65596p = numM23885v2.intValue();
        }
        numM23885v3 = webVar.m23885v("gcm.n.notification_count");
        if (numM23885v3 != null) {
            numM23885v3 = null;
        } else if (numM23885v3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM23885v3 + ". Skipping setting notificationCount.");
            numM23885v3 = null;
        }
        if (numM23885v3 != null) {
            vm6Var.f65589i = numM23885v3.intValue();
        }
        lM23864A = webVar.m23864A();
        if (lM23864A != null) {
            vm6Var.f65591k = true;
            vm6Var.f65600t.when = lM23864A.longValue();
        }
        jArrM23869F = webVar.m23869F();
        if (jArrM23869F != null) {
            vm6Var.f65600t.vibrate = jArrM23869F;
        }
        iArrM23887x = webVar.m23887x();
        if (iArrM23887x != null) {
            int i8 = iArrM23887x[0];
            i = iArrM23887x[1];
            int i9 = iArrM23887x[2];
            Notification notification3 = vm6Var.f65600t;
            notification3.ledARGB = i8;
            notification3.ledOnMS = i;
            notification3.ledOffMS = i9;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = 0;
            }
            notification3.flags = i2 | ((-2) & notification3.flags);
        }
        zM23880o = webVar.m23880o("gcm.n.default_sound");
        r0 = zM23880o;
        if (webVar.m23880o("gcm.n.default_vibrate_timings")) {
            r0 = (zM23880o ? 1 : 0) | 2;
        }
        r1 = r0;
        if (webVar.m23880o("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification = vm6Var.f65600t;
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        strM23868E6 = webVar.m23868E("gcm.n.tag");
        if (TextUtils.isEmpty(strM23868E6)) {
            strM23868E6 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strM23868E6;
        if (pz3Var != null) {
            tld tldVar2 = pz3Var.f57029c;
            lda.m16130p(tldVar2);
            bitmap = (Bitmap) Tasks.await(tldVar2, 5L, TimeUnit.SECONDS);
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = new IconCompat(1);
                iconCompat.f5505b = bitmap;
            }
            vm6Var.f65588h = iconCompat;
            tm6 tm6Var2 = new tm6();
            if (bitmap == null) {
                iconCompat2 = null;
                z = true;
            } else {
                z = true;
                iconCompat2 = new IconCompat(1);
                iconCompat2.f5505b = bitmap;
            }
            tm6Var2.f62527d = iconCompat2;
            tm6Var2.f62528e = null;
            tm6Var2.f62529f = z;
            vm6Var.m23423o(tm6Var2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f41393c).getSystemService("notification")).notify(str3, 0, vm6Var.mo15108c());
        return true;
    }

    /* JADX INFO: renamed from: G */
    public boolean m12877G(CharSequence charSequence, int i, int i2, rda rdaVar) {
        if ((rdaVar.f59141c & 3) == 0) {
            k62 k62Var = (k62) this.f41394d;
            ky5 ky5VarM20595b = rdaVar.m20595b();
            int iM22869a = ky5VarM20595b.m22869a(8);
            if (iM22869a != 0) {
                ((ByteBuffer) ky5VarM20595b.f64232d).getShort(iM22869a + ky5VarM20595b.f64229a);
            }
            k62Var.getClass();
            ThreadLocal threadLocal = k62.f46757b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = k62Var.f46758a.hasGlyph(sb.toString());
            int i3 = rdaVar.f59141c & 4;
            rdaVar.f59141c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (rdaVar.f59141c & 3) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX INFO: renamed from: H */
    public void m12878H(j02 j02Var, Uri uri, Map map, long j, long j2, C0717b c0717b) throws UnrecognizedInputFormatException {
        int i;
        hy2[] hy2VarArr;
        h62 h62Var = new h62(j02Var, j, j2);
        this.f41394d = h62Var;
        if (((hy2) this.f41393c) != null) {
            return;
        }
        i62 i62Var = (i62) this.f41392b;
        synchronized (i62Var) {
            try {
                int[] iArr = i62.f43579d;
                ArrayList arrayList = new ArrayList(21);
                int iM14411a = jdd.m14411a(map);
                if (iM14411a != -1) {
                    i62Var.m13681a(iM14411a, arrayList);
                }
                int iM14412b = jdd.m14412b(uri);
                if (iM14412b != -1 && iM14412b != iM14411a) {
                    i62Var.m13681a(iM14412b, arrayList);
                }
                i = 0;
                for (int i2 = 0; i2 < 21; i2++) {
                    int i3 = iArr[i2];
                    if (i3 != iM14411a && i3 != iM14412b) {
                        i62Var.m13681a(i3, arrayList);
                    }
                }
                hy2VarArr = (hy2[]) arrayList.toArray(new hy2[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
        c14 c14VarM6285n = ImmutableList.m6285n(hy2VarArr.length);
        boolean z = true;
        if (hy2VarArr.length == 1) {
            this.f41393c = hy2VarArr[0];
        } else {
            for (hy2 hy2Var : hy2VarArr) {
                try {
                    if (hy2Var.mo111c(h62Var)) {
                        this.f41393c = hy2Var;
                        h62Var.f41835f = 0;
                        break;
                    }
                    c14VarM6285n.m3159d(hy2Var.mo13551e());
                    boolean z2 = ((hy2) this.f41393c) != null || h62Var.f41833d == j;
                    bna.m3987z(z2);
                    h62Var.f41835f = 0;
                } catch (EOFException unused) {
                    if (((hy2) this.f41393c) != null || h62Var.f41833d == j) {
                    }
                } catch (Throwable th2) {
                    if (((hy2) this.f41393c) == null && h62Var.f41833d != j) {
                        z = false;
                    }
                    bna.m3987z(z);
                    h62Var.f41835f = 0;
                    throw th2;
                }
                bna.m3987z(z2);
                h62Var.f41835f = 0;
            }
            if (((hy2) this.f41393c) == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + new si4(", ", 1).m21395b(AbstractC1102r.m6347b(ImmutableList.m6288s(hy2VarArr), new tj0(i))) + ") could read the stream.", c14VarM6285n.m4280g());
            }
        }
        ((hy2) this.f41393c).mo113f(c0717b);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:62:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:62:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    public CharSequence m12879I(CharSequence charSequence, int i, int i2, boolean z) throws Throwable {
        gga ggaVar;
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        le9 le9Var;
        sda[] sdaVarArr;
        int spanStart;
        boolean z2 = charSequence instanceof le9;
        if (z2) {
            ((le9) charSequence).m16146a();
        }
        if (z2) {
            ggaVar = new gga((Spannable) charSequence);
            if (ggaVar != null) {
                for (sda sdaVar : sdaVarArr) {
                    spanStart = ggaVar.f40786b.getSpanStart(sdaVar);
                    int spanEnd = ggaVar.f40786b.getSpanEnd(sdaVar);
                    if (spanStart != i2) {
                        ggaVar.removeSpan(sdaVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                le9Var = (le9) charSequence2;
                le9Var.m16147b();
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                le9Var = (le9) charSequence2;
                le9Var.m16147b();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    ggaVar = new gga((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((le9) charSequence2).m16147b();
                    throw th;
                }
            } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, sda.class) > i2) {
                ggaVar = null;
            } else {
                ggaVar = new gga();
                ggaVar.f40785a = false;
                ggaVar.f40786b = new SpannableString(charSequence);
            }
            if (ggaVar != null && (sdaVarArr = (sda[]) ggaVar.f40786b.getSpans(i, i2, sda.class)) != null && sdaVarArr.length > 0) {
                while (i < r4) {
                    spanStart = ggaVar.f40786b.getSpanStart(sdaVar);
                    int spanEnd2 = ggaVar.f40786b.getSpanEnd(sdaVar);
                    if (spanStart != i2) {
                        ggaVar.removeSpan(sdaVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4 && i3 < charSequence.length()) {
                C3156jq c3156jq = new C3156jq(ggaVar, (p58) this.f41392b);
                charSequence2 = charSequence;
                try {
                    gga ggaVar2 = (gga) m12880J(charSequence2, i3, i4, Integer.MAX_VALUE, z, c3156jq);
                    if (ggaVar2 == null) {
                        if (z2) {
                            le9Var = (le9) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannable = ggaVar2.f40786b;
                    if (z2) {
                        ((le9) charSequence2).m16147b();
                    }
                    return spannable;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((le9) charSequence2).m16147b();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z2) {
                return charSequence2;
            }
            le9Var = (le9) charSequence2;
            le9Var.m16147b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((le9) charSequence2).m16147b();
        throw th;
    }

    /* JADX INFO: renamed from: J */
    public Object m12880J(CharSequence charSequence, int i, int i2, int i3, boolean z, ar2 ar2Var) {
        int i4;
        char c;
        cr2 cr2Var = new cr2((oy5) ((C3329mb) this.f41393c).f50862d);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo2999h = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMo2999h) {
                    SparseArray sparseArray = ((oy5) cr2Var.f34405f).f55305a;
                    oy5 oy5Var = sparseArray == null ? null : (oy5) sparseArray.get(iCodePointAt);
                    if (cr2Var.f34401b == 2) {
                        if (oy5Var != null) {
                            cr2Var.f34405f = oy5Var;
                            cr2Var.f34403d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                cr2Var.m9858a();
                            } else if (iCodePointAt != 65039) {
                                oy5 oy5Var2 = (oy5) cr2Var.f34405f;
                                if (oy5Var2.f55306b != null) {
                                    if (cr2Var.f34403d != 1) {
                                        cr2Var.f34406g = oy5Var2;
                                        cr2Var.m9858a();
                                    } else if (cr2Var.m9859b()) {
                                        cr2Var.f34406g = (oy5) cr2Var.f34405f;
                                        cr2Var.m9858a();
                                    } else {
                                        cr2Var.m9858a();
                                    }
                                    c = 3;
                                } else {
                                    cr2Var.m9858a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (oy5Var == null) {
                        cr2Var.m9858a();
                        c = 1;
                    } else {
                        cr2Var.f34401b = 2;
                        cr2Var.f34405f = oy5Var;
                        cr2Var.f34403d = 1;
                        c = 2;
                    }
                    cr2Var.f34402c = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && m12877G(charSequence, i4, iCharCount, ((oy5) cr2Var.f34406g).f55306b)) {
                            break;
                        }
                        zMo2999h = ar2Var.mo2999h(charSequence, i4, iCharCount, ((oy5) cr2Var.f34406g).f55306b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (cr2Var.f34401b == 2 && ((oy5) cr2Var.f34405f).f55306b != null && ((cr2Var.f34403d > 1 || cr2Var.m9859b()) && i5 < i3 && zMo2999h && (z || !m12877G(charSequence, i4, iCharCount, ((oy5) cr2Var.f34405f).f55306b)))) {
            ar2Var.mo2999h(charSequence, i4, iCharCount, ((oy5) cr2Var.f34405f).f55306b);
        }
        return ar2Var.mo2998e();
    }

    /* JADX INFO: renamed from: K */
    public void m12881K(C3830ze c3830ze) {
        xb7 xb7Var = (xb7) ((HashMap) this.f41392b).remove(c3830ze);
        xb7Var.getClass();
        g72 g72Var = (g72) ((h72) this.f41394d).f41873p.get(xb7Var);
        if (g72Var != null) {
            synchronized (g72Var) {
                g72Var.f40312d--;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m12882L(or3 or3Var) {
        this.f41393c = or3Var;
    }

    /* JADX INFO: renamed from: M */
    public void m12883M(o16 o16Var) {
        if (((ArrayList) this.f41394d) != null) {
            this.f41392b = o16Var;
        } else {
            C3386nv.m17633t("setAnnotations cannot be called after build()");
        }
    }

    /* JADX INFO: renamed from: N */
    public void m12884N(String str) {
        if (str != null) {
            this.f41392b = str;
        } else {
            C3386nv.m17635v("Null arch");
        }
    }

    /* JADX INFO: renamed from: O */
    public void m12885O(String str) {
        if (str != null) {
            this.f41394d = str;
        } else {
            C3386nv.m17635v("Null buildId");
        }
    }

    /* JADX INFO: renamed from: P */
    public void m12886P(Integer num) {
        switch (this.f41391a) {
            case 4:
                this.f41394d = num;
                break;
            case 5:
            default:
                this.f41394d = num;
                break;
            case 6:
                this.f41394d = num;
                break;
            case 7:
                this.f41394d = num;
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m12887Q(or3 or3Var) {
        switch (this.f41391a) {
            case 6:
                this.f41393c = or3Var;
                break;
            case 7:
                this.f41393c = or3Var;
                break;
            default:
                this.f41393c = or3Var;
                break;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m12888R(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f41392b = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: S */
    public void m12889S(String str) {
        if (str != null) {
            this.f41393c = str;
        } else {
            C3386nv.m17635v("Null libraryName");
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12890T(C2957ea c2957ea) {
        this.f41392b = c2957ea;
    }

    /* JADX INFO: renamed from: U */
    public void m12891U(C3403ob c3403ob) {
        this.f41392b = c3403ob;
    }

    /* JADX INFO: renamed from: V */
    public void m12892V(C3455pc c3455pc) {
        this.f41392b = c3455pc;
    }

    /* JADX INFO: renamed from: W */
    public void m12893W(lu3 lu3Var) {
        this.f41392b = lu3Var;
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: X */
    public void m12894X(android.support.v4.media.session.PlaybackStateCompat r9) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.f41392b
            fv5 r8 = (p000.fv5) r8
            r8.f39753e = r9
            java.lang.Object r1 = r8.f39751c
            monitor-enter(r1)
            android.os.RemoteCallbackList r0 = r8.f39752d     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r0 = r0 + (-1)
        L11:
            android.os.RemoteCallbackList r2 = r8.f39752d
            if (r0 < 0) goto L25
            android.os.IInterface r2 = r2.getBroadcastItem(r0)     // Catch: java.lang.Throwable -> L1f
            vx3 r2 = (p000.vx3) r2     // Catch: java.lang.Throwable -> L1f
            r2.mo12866E(r9)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L22
            goto L22
        L1f:
            r0 = move-exception
            r8 = r0
            goto L8c
        L22:
            int r0 = r0 + (-1)
            goto L11
        L25:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            android.media.session.MediaSession r8 = r8.f39749a
            android.media.session.PlaybackState r0 = r9.f978l
            if (r0 != 0) goto L86
            android.media.session.PlaybackState$Builder r1 = p000.r97.m20456d()
            int r2 = r9.f967a
            long r3 = r9.f968b
            float r5 = r9.f970d
            long r6 = r9.f974h
            p000.r97.m20476x(r1, r2, r3, r5, r6)
            long r2 = r9.f969c
            p000.r97.m20473u(r1, r2)
            long r2 = r9.f971e
            p000.r97.m20471s(r1, r2)
            java.lang.CharSequence r0 = r9.f973g
            p000.r97.m20474v(r1, r0)
            java.util.ArrayList r0 = r9.f975i
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r0.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r2 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r2
            java.lang.String r3 = r2.f979a
            java.lang.CharSequence r4 = r2.f980b
            int r5 = r2.f981c
            android.media.session.PlaybackState$CustomAction$Builder r3 = p000.r97.m20457e(r3, r4, r5)
            android.os.Bundle r2 = r2.f982d
            p000.r97.m20475w(r3, r2)
            android.media.session.PlaybackState$CustomAction r2 = p000.r97.m20454b(r3)
            p000.r97.m20453a(r1, r2)
            goto L53
        L76:
            long r2 = r9.f976j
            p000.r97.m20472t(r1, r2)
            android.os.Bundle r0 = r9.f977k
            p000.s97.m21174b(r1, r0)
            android.media.session.PlaybackState r0 = p000.r97.m20455c(r1)
            r9.f978l = r0
        L86:
            android.media.session.PlaybackState r9 = r9.f978l
            r8.setPlaybackState(r9)
            return
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv5.m12894X(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    /* JADX INFO: renamed from: Y */
    public void m12895Y(int i) {
        if (((ArrayList) this.f41394d) != null) {
            this.f41393c = Integer.valueOf(i);
        } else {
            C3386nv.m17633t("setPrimaryKeyId cannot be called after build()");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m12896Z(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(ux5.m22988k(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.f41393c = Integer.valueOf(i);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: a */
    public int mo12897a() {
        int i = ((ExtendedFloatingActionButton) this.f41394d).f12963F0;
        if (i == -1) {
            return ((C3156jq) this.f41392b).mo12897a();
        }
        return (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((vj6) this.f41393c).f65506b).getMeasuredHeight() : i;
    }

    /* JADX INFO: renamed from: a0 */
    public void m12898a0(xv5 xv5Var) {
        xv5Var.getClass();
        if (xv5Var.f68848b.equals("multipart")) {
            this.f41393c = xv5Var;
        } else {
            ij6.m13961s(xv5Var, "multipart != ");
        }
    }

    @Override // p000.nt8
    /* JADX INFO: renamed from: b */
    public void mo11950b(k47 k47Var) {
        long jM12282d;
        long j;
        ((g1a) this.f41393c).getClass();
        String str = uma.f64080a;
        g1a g1aVar = (g1a) this.f41393c;
        synchronized (g1aVar) {
            try {
                long j2 = g1aVar.f40053c;
                jM12282d = j2 != -9223372036854775807L ? j2 + g1aVar.f40052b : g1aVar.m12282d();
            } catch (Throwable th) {
                throw th;
            }
        }
        g1a g1aVar2 = (g1a) this.f41393c;
        synchronized (g1aVar2) {
            j = g1aVar2.f40052b;
        }
        if (jM12282d == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        C0713b c0713b = (C0713b) this.f41392b;
        if (j != c0713b.f6411t) {
            lc3 lc3VarM2520a = c0713b.m2520a();
            lc3VarM2520a.f49458s = j;
            C0713b c0713b2 = new C0713b(lc3VarM2520a);
            this.f41392b = c0713b2;
            ((n8a) this.f41394d).mo2537g(c0713b2);
        }
        int iM14820a = k47Var.m14820a();
        ((n8a) this.f41394d).mo2535e(iM14820a, k47Var);
        ((n8a) this.f41394d).mo2531a(jM12282d, 1, iM14820a, 0, null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m12899b0(C2920da c2920da) {
        this.f41394d = c2920da;
    }

    @Override // p000.nt8
    /* JADX INFO: renamed from: c */
    public void mo11951c(g1a g1aVar, jy2 jy2Var, mca mcaVar) {
        this.f41393c = g1aVar;
        mcaVar.m16767a();
        mcaVar.m16768b();
        n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 5);
        this.f41394d = n8aVarMo2555n;
        n8aVarMo2555n.mo2537g((C0713b) this.f41392b);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: d */
    public int mo12900d() {
        int i = ((ExtendedFloatingActionButton) this.f41394d).f12962E0;
        if (i == -1) {
            return ((C3156jq) this.f41392b).mo12900d();
        }
        return (i == 0 || i == -2) ? ((vj6) this.f41393c).mo12900d() : i;
    }

    @Override // p000.zr2
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ zr2 mo12901e(Class cls, fp6 fp6Var) {
        ((HashMap) this.f41392b).put(cls, fp6Var);
        ((HashMap) this.f41393c).remove(cls);
        return this;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: f */
    public int mo12902f() {
        return ((ExtendedFloatingActionButton) this.f41394d).f12972y0;
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: g */
    public void mo64g(String str) {
        switch (this.f41391a) {
            case 12:
                ((C2251a) this.f41392b).m9203V2();
                break;
            default:
                ((C2255e) this.f41392b).m9239a3();
                break;
        }
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: h */
    public void mo65h(String str) {
        int i = this.f41391a;
        str.getClass();
        switch (i) {
            case 12:
                Activity activity = (Activity) this.f41394d;
                if (activity != null) {
                    mbd.m16755c(activity, str, null, 30);
                }
                break;
            default:
                Activity activity2 = (Activity) this.f41394d;
                if (activity2 != null) {
                    mbd.m16755c(activity2, str, null, 30);
                }
                break;
        }
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: i */
    public void mo66i(c55 c55Var) {
        switch (this.f41391a) {
            case 12:
                ((C2251a) this.f41392b).m9203V2();
                ((vi3) this.f41393c).invoke(new ki6(c55Var.f9574a, c55Var.f9576c, c55Var.f9575b));
                break;
            default:
                ((C2255e) this.f41392b).m9239a3();
                ((vi3) this.f41393c).invoke(new ki6(c55Var.f9574a, c55Var.f9576c, c55Var.f9575b));
                break;
        }
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams mo12903j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f41394d;
        int i = extendedFloatingActionButton.f12962E0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.f12963F0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // p000.a35
    /* JADX INFO: renamed from: k */
    public void mo67k(int i) {
        switch (this.f41391a) {
            case 12:
                ((C2251a) this.f41392b).m9203V2();
                ((vi3) this.f41393c).invoke(new ii6(i));
                break;
            default:
                ((C2255e) this.f41392b).m9239a3();
                ((vi3) this.f41393c).invoke(new ii6(i));
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12904l(si4 si4Var, int i, String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f41394d;
        if (arrayList != null) {
            arrayList.add(new p16(si4Var, i, str, str2));
        } else {
            C3386nv.m17633t("addEntry cannot be called after build()");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12905m(qr3 qr3Var, z68 z68Var) {
        z68Var.getClass();
        if (qr3Var.m20121d("Content-Type") != null) {
            C3386nv.m17626m("Unexpected header: Content-Type");
        } else if (qr3Var.m20121d("Content-Length") != null) {
            C3386nv.m17626m("Unexpected header: Content-Length");
        } else {
            ((ArrayList) this.f41394d).add(new l56(qr3Var, z68Var));
        }
    }

    /* JADX INFO: renamed from: n */
    public C3714w9 m12906n() throws GeneralSecurityException {
        or3 or3Var;
        yk0 yk0VarM25164a;
        C2957ea c2957ea = (C2957ea) this.f41392b;
        if (c2957ea == null || (or3Var = (or3) this.f41393c) == null) {
            v63.m23147y("Cannot build without parameters and/or key material");
            return null;
        }
        if (c2957ea.f36892C != ((yk0) or3Var.f54782a).f69925a.length) {
            v63.m23147y("Key size mismatch");
            return null;
        }
        C2920da c2920da = c2957ea.f36894E;
        C2920da c2920da2 = C2920da.f35227f;
        if (c2920da != c2920da2 && ((Integer) this.f41394d) == null) {
            v63.m23147y("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (c2920da == c2920da2 && ((Integer) this.f41394d) != null) {
            v63.m23147y("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (c2920da == c2920da2) {
            yk0VarM25164a = yk0.m25164a(new byte[0]);
        } else if (c2920da == C2920da.f35226e || c2920da == C2920da.f35225d) {
            yk0VarM25164a = yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f41394d).intValue()).array());
        } else {
            if (c2920da != C2920da.f35224c) {
                v63.m23127A(((C2957ea) this.f41392b).f36894E, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            yk0VarM25164a = yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f41394d).intValue()).array());
        }
        return new C3714w9((C2957ea) this.f41392b, yk0VarM25164a);
    }

    /* JADX INFO: renamed from: o */
    public C2957ea m12907o() {
        Integer num = (Integer) this.f41392b;
        if (num == null) {
            v63.m23147y("key size not set");
            return null;
        }
        if (((Integer) this.f41393c) != null) {
            return new C2957ea(num.intValue(), ((Integer) this.f41393c).intValue(), (C2920da) this.f41394d);
        }
        v63.m23147y("tag size not set");
        return null;
    }

    @Override // p000.a35
    public void onDismiss() {
        switch (this.f41391a) {
            case 12:
                ((C2251a) this.f41392b).m9203V2();
                break;
            default:
                ((C2255e) this.f41392b).m9239a3();
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public C3106ib m12908p() throws GeneralSecurityException {
        or3 or3Var;
        C3403ob c3403ob = (C3403ob) this.f41392b;
        if (c3403ob == null || (or3Var = (or3) this.f41393c) == null) {
            v63.m23147y("Cannot build without parameters and/or key material");
            return null;
        }
        if (c3403ob.f54121C != ((yk0) or3Var.f54782a).f69925a.length) {
            v63.m23147y("Key size mismatch");
            return null;
        }
        C3366nb c3366nb = c3403ob.f54124F;
        C3366nb c3366nb2 = C3366nb.f52551e;
        if (c3366nb != c3366nb2 && ((Integer) this.f41394d) == null) {
            v63.m23147y("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (c3366nb == c3366nb2 && ((Integer) this.f41394d) != null) {
            v63.m23147y("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (c3366nb == c3366nb2) {
            yk0.m25164a(new byte[0]);
        } else if (c3366nb == C3366nb.f52550d) {
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f41394d).intValue()).array());
        } else {
            if (c3366nb != C3366nb.f52549c) {
                v63.m23127A(((C3403ob) this.f41392b).f54124F, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f41394d).intValue()).array());
        }
        return new C3106ib();
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: q */
    public int mo12909q() {
        return ((ExtendedFloatingActionButton) this.f41394d).f12971x0;
    }

    /* JADX INFO: renamed from: r */
    public C3179kc m12910r() throws GeneralSecurityException {
        or3 or3Var;
        C3455pc c3455pc = (C3455pc) this.f41392b;
        if (c3455pc == null || (or3Var = (or3) this.f41393c) == null) {
            v63.m23147y("Cannot build without parameters and/or key material");
            return null;
        }
        if (c3455pc.f55935C != ((yk0) or3Var.f54782a).f69925a.length) {
            v63.m23147y("Key size mismatch");
            return null;
        }
        C3404oc c3404oc = c3455pc.f55936D;
        C3404oc c3404oc2 = C3404oc.f54158e;
        if (c3404oc != c3404oc2 && ((Integer) this.f41394d) == null) {
            v63.m23147y("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (c3404oc == c3404oc2 && ((Integer) this.f41394d) != null) {
            v63.m23147y("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (c3404oc == c3404oc2) {
            yk0.m25164a(new byte[0]);
        } else if (c3404oc == C3404oc.f54157d) {
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f41394d).intValue()).array());
        } else {
            if (c3404oc != C3404oc.f54156c) {
                v63.m23127A(((C3455pc) this.f41392b).f55936D, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f41394d).intValue()).array());
        }
        return new C3179kc();
    }

    /* JADX INFO: renamed from: s */
    public b30 m12911s() {
        String str;
        String str2;
        String str3 = (String) this.f41392b;
        if (str3 != null && (str = (String) this.f41393c) != null && (str2 = (String) this.f41394d) != null) {
            return new b30(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.f41392b) == null) {
            sb.append(" arch");
        }
        if (((String) this.f41393c) == null) {
            sb.append(" libraryName");
        }
        if (((String) this.f41394d) == null) {
            sb.append(" buildId");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: t */
    public gu3 m12912t() throws GeneralSecurityException {
        or3 or3Var;
        yk0 yk0VarM25164a;
        lu3 lu3Var = (lu3) this.f41392b;
        if (lu3Var == null || (or3Var = (or3) this.f41393c) == null) {
            v63.m23147y("Cannot build without parameters and/or key material");
            return null;
        }
        if (lu3Var.f50135C != ((yk0) or3Var.f54782a).f69925a.length) {
            v63.m23147y("Key size mismatch");
            return null;
        }
        C2920da c2920da = lu3Var.f50137E;
        C2920da c2920da2 = C2920da.f35233l;
        if (c2920da != c2920da2 && ((Integer) this.f41394d) == null) {
            v63.m23147y("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (c2920da == c2920da2 && ((Integer) this.f41394d) != null) {
            v63.m23147y("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (c2920da == c2920da2) {
            yk0VarM25164a = yk0.m25164a(new byte[0]);
        } else if (c2920da == C2920da.f35232k || c2920da == C2920da.f35231j) {
            yk0VarM25164a = yk0.m25164a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f41394d).intValue()).array());
        } else {
            if (c2920da != C2920da.f35230i) {
                v63.m23127A(((lu3) this.f41392b).f50137E, "Unknown HmacParameters.Variant: ");
                return null;
            }
            yk0VarM25164a = yk0.m25164a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f41394d).intValue()).array());
        }
        return new gu3((lu3) this.f41392b, yk0VarM25164a);
    }

    public String toString() {
        switch (this.f41391a) {
            case 25:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f41392b);
                sb.append('{');
                p33 p33Var = (p33) ((p33) this.f41393c).f55514c;
                String str = "";
                while (p33Var != null) {
                    Object obj = p33Var.f55513b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    p33Var = (p33) p33Var.f55514c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public q16 m12913u() {
        if (((ArrayList) this.f41394d) == null) {
            C3386nv.m17633t("cannot call build() twice");
            return null;
        }
        Integer num = (Integer) this.f41393c;
        if (num != null) {
            int iIntValue = num.intValue();
            Iterator it = ((ArrayList) this.f41394d).iterator();
            while (it.hasNext()) {
                if (((p16) it.next()).f55431b == iIntValue) {
                }
            }
            v63.m23147y("primary key ID is not present in entries");
            return null;
        }
        q16 q16Var = new q16((o16) this.f41392b, Collections.unmodifiableList((ArrayList) this.f41394d), (Integer) this.f41393c);
        this.f41394d = null;
        return q16Var;
    }

    /* JADX INFO: renamed from: v */
    public m56 m12914v() {
        ArrayList arrayList = (ArrayList) this.f41394d;
        if (!arrayList.isEmpty()) {
            return new m56((ByteString) this.f41392b, (xv5) this.f41393c, kcb.m15119j(arrayList));
        }
        C3386nv.m17633t("Multipart body must have at least one part.");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public String m12915y() {
        return (String) this.f41394d;
    }

    /* JADX INFO: renamed from: z */
    public long m12916z() {
        h62 h62Var = (h62) this.f41394d;
        if (h62Var != null) {
            return h62Var.f41833d;
        }
        return -1L;
    }

    public /* synthetic */ gv5(int i, boolean z) {
        this.f41391a = i;
        this.f41392b = null;
        this.f41393c = null;
        this.f41394d = null;
    }

    public /* synthetic */ gv5(Object obj, int i) {
        this.f41391a = i;
        this.f41392b = obj;
    }

    public /* synthetic */ gv5(Object obj, Object obj2, Object obj3, int i) {
        this.f41391a = i;
        this.f41392b = obj;
        this.f41393c = obj2;
        this.f41394d = obj3;
    }

    public /* synthetic */ gv5(boolean z) {
        this.f41391a = 9;
    }

    public gv5(int i) {
        this.f41391a = i;
        switch (i) {
            case 5:
                this.f41392b = null;
                this.f41393c = null;
                this.f41394d = C2920da.f35227f;
                break;
            case 26:
                String string = UUID.randomUUID().toString();
                string.getClass();
                ByteString byteString = ByteString.f54513d;
                this.f41392b = iy5.m14193h(string);
                this.f41393c = m56.f50604f;
                this.f41394d = new ArrayList();
                break;
            default:
                this.f41392b = new HashMap();
                this.f41393c = new HashMap();
                this.f41394d = f41390i;
                break;
        }
    }

    public gv5(List list) {
        this.f41391a = 22;
        this.f41393c = list;
        this.f41394d = new ArrayList(list.size());
        this.f41392b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f41394d).add(new b49((List) ((mq5) list.get(i)).f51728b.f57375b));
            ((ArrayList) this.f41392b).add(((mq5) list.get(i)).f51729c.mo550a());
        }
    }

    public gv5(Drawable.Callback callback, String str, Map map) {
        this.f41391a = 1;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f41393c = str.concat("/");
        } else {
            this.f41393c = str;
        }
        this.f41394d = map;
        if (!(callback instanceof View)) {
            this.f41392b = null;
        } else {
            this.f41392b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public /* synthetic */ gv5(int i, byte b) {
        this.f41391a = i;
    }

    public gv5(jr5 jr5Var, View view) {
        Object kr5Var;
        this.f41391a = 23;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            kr5Var = new mr5();
        } else {
            kr5Var = i >= 33 ? new kr5() : null;
        }
        this.f41392b = kr5Var;
        this.f41393c = jr5Var;
        this.f41394d = view;
    }

    public gv5(FirebaseMessagingService firebaseMessagingService, web webVar, ExecutorService executorService) {
        this.f41391a = 16;
        this.f41392b = executorService;
        this.f41393c = firebaseMessagingService;
        this.f41394d = webVar;
    }

    public gv5(Context context, int i) {
        this.f41391a = i;
        switch (i) {
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                this.f41392b = context;
                this.f41394d = new ArrayList();
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xwc.m24751X(R$attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, R$styleable.MaterialCalendar);
                this.f41392b = vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0));
                vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0));
                vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0));
                vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0));
                ColorStateList colorStateListM19054x = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
                this.f41393c = vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0));
                vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0));
                this.f41394d = vqb.m23468t(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0));
                new Paint().setColor(colorStateListM19054x.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public gv5(C3329mb c3329mb, p58 p58Var, k62 k62Var, Set set) {
        this.f41391a = 17;
        this.f41392b = p58Var;
        this.f41393c = c3329mb;
        this.f41394d = k62Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m12880J(str, 0, str.length(), 1, true, new gp0(str, 4));
        }
    }

    public gv5(String str, int i) {
        this.f41391a = i;
        switch (i) {
            case 28:
                lc3 lc3Var = new lc3();
                lc3Var.f49452m = ez5.m11402l("video/mp2t");
                lc3Var.f49453n = ez5.m11402l(str);
                this.f41392b = new C0713b(lc3Var);
                break;
            default:
                p33 p33Var = new p33(11, false);
                this.f41393c = p33Var;
                this.f41394d = p33Var;
                this.f41392b = str;
                break;
        }
    }

    public gv5(ExtendedFloatingActionButton extendedFloatingActionButton, C3156jq c3156jq, vj6 vj6Var) {
        this.f41391a = 19;
        this.f41394d = extendedFloatingActionButton;
        this.f41392b = c3156jq;
        this.f41393c = vj6Var;
    }

    public gv5(PlayerService playerService, String str) {
        this.f41391a = 0;
        this.f41394d = new ArrayList();
        PendingIntent broadcast = null;
        if (!TextUtils.isEmpty(str)) {
            ComponentName componentNameM19476b = pt5.m19476b(playerService);
            if (componentNameM19476b == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentNameM19476b != null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentNameM19476b);
                broadcast = PendingIntent.getBroadcast(playerService, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            fv5 fv5Var = new fv5(playerService, str);
            this.f41392b = fv5Var;
            fv5Var.m12212a(new bv5(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            fv5Var.f39749a.setMediaButtonReceiver(broadcast);
            this.f41393c = new vj6(playerService, this);
            if (f41386e == 0) {
                f41386e = (int) (TypedValue.applyDimension(1, 320.0f, playerService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        C3386nv.m17626m("tag must not be null or empty");
        throw null;
    }

    public gv5(C3851zz c3851zz) {
        this.f41391a = 8;
        this.f41394d = c3851zz;
        Handler handlerM22816k = uma.m22816k(null);
        this.f41392b = handlerM22816k;
        C3814yz c3814yz = new C3814yz(this);
        this.f41393c = c3814yz;
        c3851zz.f72401a.registerStreamEventCallback(new ExecutorC3777xz(handlerM22816k), c3814yz);
    }

    public gv5(h72 h72Var, xb7 xb7Var) {
        this.f41391a = 14;
        this.f41394d = h72Var;
        this.f41392b = new HashMap();
        this.f41393c = xb7Var;
    }
}
