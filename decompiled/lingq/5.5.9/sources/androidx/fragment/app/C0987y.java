package androidx.fragment.app;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.clevertap.android.sdk.C2181a;
import dm.C5207g;
import java.io.File;
import java.util.List;
import p088e7.C5382b;
import p402u0.C9371n;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0987y {
    /* JADX INFO: renamed from: a */
    public static void m3819a(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m3820b(String str, int i10) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x01db  */
    /* JADX WARN: Code duplicated, block: B:59:0x027c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0280  */
    /* JADX WARN: Code duplicated, block: B:62:0x0281  */
    /* JADX WARN: Code duplicated, block: B:63:0x0284 A[Catch: Exception -> 0x02a3, TryCatch #0 {Exception -> 0x02a3, blocks: (B:49:0x01ef, B:50:0x0204, B:52:0x021a, B:54:0x021f, B:55:0x023a, B:56:0x025a, B:10:0x0054, B:11:0x006e, B:19:0x009a, B:20:0x00af, B:23:0x00ca, B:25:0x00cf, B:26:0x00df, B:27:0x00f4, B:28:0x0104, B:31:0x0132, B:32:0x0147, B:34:0x0165, B:35:0x017a, B:41:0x019a, B:42:0x01b5, B:63:0x0284), top: B:71:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x02a3  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00ca. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x021a. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0284, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static C5382b m3821c(int i10, int i11, String... strArr) {
        String str;
        C5382b c5382b = new C5382b();
        c5382b.f33797a = i10;
        if (i10 != 531) {
            try {
                switch (i10) {
                    case 510:
                        if (i11 != 11) {
                            str = strArr[0] + "... exceeds the limit of " + strArr[1] + " characters. Trimmed";
                        } else if (i11 != 14) {
                            str = "Event Name is null";
                        } else {
                            str = "";
                        }
                        break;
                    case 511:
                        if (i11 == 7) {
                            str = "For event " + strArr[0] + ": Property value for property " + strArr[1] + " wasn't a primitive (" + strArr[2] + ")";
                        } else if (i11 != 15) {
                            str = "";
                        } else {
                            str = "An item's object value for key " + strArr[0] + " wasn't a primitive (" + strArr[1] + ")";
                        }
                        break;
                    case 512:
                        if (i11 != 25) {
                            switch (i11) {
                                case 1:
                                    str = "Invalid multi value for key " + strArr[0] + ", profile multi value operation aborted.";
                                    break;
                                case 2:
                                    str = "Profile push key is empty";
                                    break;
                                case 3:
                                    str = "Object value wasn't a primitive (" + strArr[0] + ") for profile field " + strArr[1];
                                    break;
                                case 4:
                                    str = "Device country code not available and profile phone: " + strArr[0] + " does not appear to start with country code";
                                    break;
                                case 5:
                                    str = "Invalid phone number";
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    str = "Key is empty, profile removeValueForKey aborted.";
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    str = "For event \"" + strArr[0] + "\": Property value for property " + strArr[1] + " wasn't a primitive (" + strArr[2] + ")";
                                    break;
                                case 8:
                                    str = "Unable to render notification, channelId is required but not provided in the notification payload: " + strArr[0];
                                    break;
                                case 9:
                                    str = "Unable to render notification, channelId: " + strArr[0] + " not registered by the app.";
                                    break;
                                case 10:
                                    str = "Recording of Notification Viewed is disabled in the CleverTap Dashboard for notification payload: " + strArr[0];
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "Increment/Decrement value for profile key " + strArr[0] + ", cannot be zero or negative";
                        }
                        break;
                    case 513:
                        if (i11 == 16) {
                            str = strArr[0] + " is a restricted event name. Last event aborted.";
                        } else if (i11 != 17) {
                            str = "";
                        } else {
                            str = strArr[0] + " is a discarded event name. Last event aborted.";
                        }
                        break;
                    case 514:
                        switch (i11) {
                            case 18:
                                str = "CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml/Instance Configuration. CleverTap SDK will create a fallback device ID";
                                break;
                            case 19:
                                str = "CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml. Custom CleverTap ID passed will not be used.";
                                break;
                            case 20:
                                str = "CleverTap ID - " + strArr[0] + " already exists. Unable to set custom CleverTap ID - " + strArr[1];
                                break;
                            case 21:
                                str = "Attempted to set invalid custom CleverTap ID - " + strArr[0] + ", falling back to default error CleverTap ID - " + strArr[1];
                                break;
                            default:
                                str = "";
                                break;
                        }
                        break;
                    default:
                        switch (i10) {
                            case 520:
                                if (i11 != 11) {
                                    str = strArr[0] + "... exceeds the limit of " + strArr[1] + " characters. Trimmed";
                                } else if (i11 != 14) {
                                    str = "Event Name is null";
                                } else {
                                    str = "";
                                }
                                break;
                            case 521:
                                switch (i11) {
                                    case 11:
                                        str = strArr[0] + "... exceeds the limit of " + strArr[1] + " characters. Trimmed";
                                        break;
                                    case 12:
                                        str = "Multi value property for key " + strArr[0] + " exceeds the limit of " + strArr[1] + " items. Trimmed";
                                        break;
                                    case 13:
                                        str = "Invalid user profile property array count - " + strArr[0] + " max is - " + strArr[1];
                                        break;
                                    default:
                                        str = "";
                                        break;
                                }
                                break;
                            case 522:
                                str = "Charged event contained more than 50 items.";
                                break;
                            case 523:
                                if (i11 == 23) {
                                    str = "Invalid multi-value property key " + strArr[0];
                                } else if (i11 != 24) {
                                    str = "";
                                } else {
                                    str = strArr[0] + "... is a restricted key for multi-value properties. Operation aborted.";
                                }
                                break;
                            default:
                                str = "";
                                break;
                        }
                        break;
                }
            } catch (Exception unused) {
            }
        } else {
            str = "Profile Identifiers mismatch with the previously saved ones";
        }
        c5382b.f33798b = str;
        return c5382b;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3822d(Context context, String str) {
        boolean z10;
        C5207g.m11111f(context, "<this>");
        C5207g.m11111f(str, "channelId");
        if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("notification");
            C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            z10 = ((NotificationManager) systemService).getNotificationChannel(str).getImportance() != 0;
        } catch (Exception unused) {
            C2181a.m6449a("Unable to find notification channel with id = ".concat(str));
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static String m3823e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX INFO: renamed from: f */
    public static final void m3824f(Bundle bundle, Fragment fragment, String str) {
        C5207g.m11111f(fragment, "<this>");
        FragmentManager fragmentManagerM3598r = fragment.m3598r();
        FragmentManager.C0928m c0928m = fragmentManagerM3598r.f6169l.get(str);
        if (c0928m != null) {
            if (c0928m.f6198a.mo3884b().isAtLeast(Lifecycle.State.STARTED)) {
                c0928m.mo3679b(bundle, str);
            } else {
                fragmentManagerM3598r.f6168k.put(str, bundle);
            }
        } else {
            fragmentManagerM3598r.f6168k.put(str, bundle);
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m3825g(Fragment fragment, final String str, InterfaceC2056p interfaceC2056p) {
        C5207g.m11111f(fragment, "<this>");
        final FragmentManager fragmentManagerM3598r = fragment.m3598r();
        final C9371n c9371n = new C9371n(2, interfaceC2056p);
        final C1052r c1052r = fragment.f6112l0;
        if (c1052r.f6681d == Lifecycle.State.DESTROYED) {
            return;
        }
        InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: androidx.fragment.app.FragmentManager.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f6184a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC0957i0 f6185b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Lifecycle f6186c;

            public C09146() {
                str = str;
                c9371n = c9371n;
                lifecycle = c1052r;
            }

            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                Bundle bundle;
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                FragmentManager fragmentManager = FragmentManager.this;
                String str2 = str;
                if (event == event2 && (bundle = fragmentManager.f6168k.get(str2)) != null) {
                    c9371n.mo3679b(bundle, str2);
                    fragmentManager.f6168k.remove(str2);
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key " + str2);
                    }
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.mo3885c(this);
                    fragmentManager.f6169l.remove(str2);
                }
            }
        };
        FragmentManager.C0928m c0928mPut = fragmentManagerM3598r.f6169l.put(str, new FragmentManager.C0928m(c1052r, c9371n, interfaceC1049o));
        if (c0928mPut != null) {
            c0928mPut.f6198a.mo3885c(c0928mPut.f6200c);
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + c1052r + " and listener " + c9371n);
        }
        c1052r.mo3883a(interfaceC1049o);
    }

    /* JADX INFO: renamed from: h */
    public static void m3826h(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m3827i(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        parcel.writeBundle(bundle);
        m3839u(parcel, iM3836r);
    }

    /* JADX INFO: renamed from: j */
    public static void m3828j(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        m3839u(parcel, iM3836r);
    }

    /* JADX INFO: renamed from: k */
    public static void m3829k(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    /* JADX INFO: renamed from: l */
    public static void m3830l(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    /* JADX INFO: renamed from: m */
    public static void m3831m(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        m3839u(parcel, iM3836r);
    }

    /* JADX INFO: renamed from: n */
    public static void m3832n(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        parcel.writeString(str);
        m3839u(parcel, iM3836r);
    }

    /* JADX INFO: renamed from: o */
    public static void m3833o(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m3840v(parcel, parcelable, i11);
            }
        }
        m3839u(parcel, iM3836r);
    }

    /* JADX INFO: renamed from: p */
    public static void m3834p(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iM3836r = m3836r(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m3840v(parcel, parcelable, 0);
            }
        }
        m3839u(parcel, iM3836r);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: q */
    public static int m3835q(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public static int m3836r(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public static String m3837s(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (!strReplaceFirst.equals("base-master") && !strReplaceFirst.equals("base-main")) {
            return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        return "";
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m3838t(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static void m3839u(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: v */
    public static void m3840v(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
