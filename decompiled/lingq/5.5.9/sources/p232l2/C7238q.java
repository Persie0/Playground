package p232l2;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import p326q.C8448d;

/* JADX INFO: renamed from: l2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7238q {

    /* JADX INFO: renamed from: a */
    public final Context f40669a;

    /* JADX INFO: renamed from: b */
    public final Notification.Builder f40670b;

    /* JADX INFO: renamed from: c */
    public final C7236o f40671c;

    /* JADX INFO: renamed from: d */
    public final Bundle f40672d;

    public C7238q(C7236o c7236o) {
        int i10;
        Bundle[] bundleArr;
        int i11;
        ArrayList<String> arrayList;
        int i12;
        new ArrayList();
        this.f40672d = new Bundle();
        this.f40671c = c7236o;
        this.f40669a = c7236o.f40641a;
        Notification.Builder builder = new Notification.Builder(c7236o.f40641a, c7236o.f40660t);
        this.f40670b = builder;
        Notification notification = c7236o.f40664x;
        Resources resources = null;
        int i13 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c7236o.f40645e).setContentText(c7236o.f40646f).setContentInfo(null).setContentIntent(c7236o.f40647g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & BuildConfig.SDK_TRUNCATE_LENGTH) != 0).setLargeIcon(c7236o.f40648h).setNumber(c7236o.f40649i).setProgress(0, 0, false);
        builder.setSubText(c7236o.f40653m).setUsesChronometer(false).setPriority(c7236o.f40650j);
        for (C7233l c7233l : c7236o.f40642b) {
            if (c7233l.f40627b == null && (i12 = c7233l.f40633h) != 0) {
                c7233l.f40627b = IconCompat.m2962a(null, "", i12);
            }
            IconCompat iconCompat = c7233l.f40627b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat != null ? IconCompat.C0778a.m2971f(iconCompat, null) : null, c7233l.f40634i, c7233l.f40635j);
            C7244w[] c7244wArr = c7233l.f40628c;
            if (c7244wArr != null) {
                int length = c7244wArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (c7244wArr.length > 0) {
                    C7244w c7244w = c7244wArr[0];
                    throw null;
                }
                for (int i14 = 0; i14 < length; i14++) {
                    builder2.addRemoteInput(remoteInputArr[i14]);
                }
            }
            Bundle bundle = c7233l.f40626a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z10 = c7233l.f40629d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i15 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(z10);
            int i16 = c7233l.f40631f;
            bundle2.putInt("android.support.action.semanticAction", i16);
            if (i15 >= 28) {
                builder2.setSemanticAction(i16);
            }
            if (i15 >= 29) {
                builder2.setContextual(c7233l.f40632g);
            }
            if (i15 >= 31) {
                builder2.setAuthenticationRequired(c7233l.f40636k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c7233l.f40630e);
            builder2.addExtras(bundle2);
            this.f40670b.addAction(builder2.build());
        }
        Bundle bundle3 = c7236o.f40657q;
        if (bundle3 != null) {
            this.f40672d.putAll(bundle3);
        }
        int i17 = Build.VERSION.SDK_INT;
        this.f40670b.setShowWhen(c7236o.f40651k);
        this.f40670b.setLocalOnly(c7236o.f40654n).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f40670b.setCategory(null).setColor(c7236o.f40658r).setVisibility(c7236o.f40659s).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<C7242u> arrayList2 = c7236o.f40643c;
        ArrayList<String> arrayList3 = c7236o.f40665y;
        if (i17 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                for (C7242u c7242u : arrayList2) {
                    String str = c7242u.f40676c;
                    if (str == null) {
                        CharSequence charSequence = c7242u.f40674a;
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList3 != null) {
                    C8448d c8448d = new C8448d(arrayList3.size() + arrayList.size());
                    c8448d.addAll(arrayList);
                    c8448d.addAll(arrayList3);
                    arrayList = new ArrayList<>(c8448d);
                }
                arrayList3 = arrayList;
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator<String> it = arrayList3.iterator();
            while (it.hasNext()) {
                this.f40670b.addPerson(it.next());
            }
        }
        ArrayList<C7233l> arrayList4 = c7236o.f40644d;
        if (arrayList4.size() > 0) {
            if (c7236o.f40657q == null) {
                c7236o.f40657q = new Bundle();
            }
            Bundle bundle4 = c7236o.f40657q.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            while (i13 < arrayList4.size()) {
                String string = Integer.toString(i13);
                C7233l c7233l2 = arrayList4.get(i13);
                Object obj = C7239r.f40673a;
                Bundle bundle7 = new Bundle();
                if (c7233l2.f40627b == null && (i11 = c7233l2.f40633h) != 0) {
                    c7233l2.f40627b = IconCompat.m2962a(resources, "", i11);
                }
                IconCompat iconCompat2 = c7233l2.f40627b;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.m2963b() : 0);
                bundle7.putCharSequence("title", c7233l2.f40634i);
                bundle7.putParcelable("actionIntent", c7233l2.f40635j);
                Bundle bundle8 = c7233l2.f40626a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", c7233l2.f40629d);
                bundle7.putBundle("extras", bundle9);
                C7244w[] c7244wArr2 = c7233l2.f40628c;
                if (c7244wArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[c7244wArr2.length];
                    if (c7244wArr2.length > 0) {
                        C7244w c7244w2 = c7244wArr2[0];
                        new Bundle();
                        throw null;
                    }
                    bundleArr = bundleArr2;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", c7233l2.f40630e);
                bundle7.putInt("semanticAction", c7233l2.f40631f);
                bundle6.putBundle(string, bundle7);
                i13++;
                resources = null;
                arrayList4 = arrayList4;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (c7236o.f40657q == null) {
                c7236o.f40657q = new Bundle();
            }
            c7236o.f40657q.putBundle("android.car.EXTENSIONS", bundle4);
            this.f40672d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i18 = Build.VERSION.SDK_INT;
        this.f40670b.setExtras(c7236o.f40657q).setRemoteInputHistory(null);
        this.f40670b.setBadgeIconType(c7236o.f40661u).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
        if (c7236o.f40656p) {
            this.f40670b.setColorized(c7236o.f40655o);
        }
        if (!TextUtils.isEmpty(c7236o.f40660t)) {
            this.f40670b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i18 >= 28) {
            for (C7242u c7242u2 : arrayList2) {
                Notification.Builder builder3 = this.f40670b;
                c7242u2.getClass();
                builder3.addPerson(C7242u.a.m14586b(c7242u2));
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            this.f40670b.setAllowSystemGeneratedContextualActions(c7236o.f40663w);
            this.f40670b.setBubbleMetadata(null);
        }
        if (i19 < 31 || (i10 = c7236o.f40662v) == 0) {
            return;
        }
        this.f40670b.setForegroundServiceBehavior(i10);
    }
}
