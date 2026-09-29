package p000;

import android.R;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: renamed from: mb */
/* JADX INFO: loaded from: classes.dex */
public final class C3329mb implements cn9, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50859a;

    /* JADX INFO: renamed from: b */
    public Object f50860b;

    /* JADX INFO: renamed from: c */
    public Object f50861c;

    /* JADX INFO: renamed from: d */
    public Object f50862d;

    /* JADX INFO: renamed from: e */
    public Object f50863e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3329mb(vm6 vm6Var) {
        String str;
        String str2;
        int i;
        Bundle[] bundleArr;
        int i2;
        Iterator it;
        int i3;
        this.f50859a = 11;
        this.f50863e = new Bundle();
        this.f50862d = vm6Var;
        Context context = vm6Var.f65581a;
        ArrayList arrayList = vm6Var.f65584d;
        this.f50860b = context;
        Notification.Builder builder = new Notification.Builder(context, vm6Var.f65597q);
        this.f50861c = builder;
        Notification notification = vm6Var.f65600t;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(vm6Var.f65585e).setContentText(vm6Var.f65586f).setContentInfo(null).setContentIntent(vm6Var.f65587g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(vm6Var.f65589i).setProgress(0, 0, false);
        IconCompat iconCompat = vm6Var.f65588h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m1997d(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(vm6Var.f65590j);
        Iterator it2 = vm6Var.f65582b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "userInput";
            if (!it2.hasNext()) {
                break;
            }
            pm6 pm6Var = (pm6) it2.next();
            if (pm6Var.f56474b == null && (i3 = pm6Var.f56478f) != 0) {
                pm6Var.f56474b = IconCompat.m1994a(i3);
            }
            IconCompat iconCompat2 = pm6Var.f56474b;
            boolean z = pm6Var.f56476d;
            Bundle bundle = pm6Var.f56473a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.m1997d(context2) : context2, pm6Var.f56479g, pm6Var.f56480h);
            j58[] j58VarArr = pm6Var.f56475c;
            if (j58VarArr != null) {
                int length = j58VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                int i4 = 0;
                while (i4 < j58VarArr.length) {
                    j58 j58Var = j58VarArr[i4];
                    Iterator it3 = it2;
                    j58Var.getClass();
                    j58[] j58VarArr2 = j58VarArr;
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("userInput").setLabel(j58Var.f45096a).setChoices(null).setAllowFreeFormInput(true).addExtras(j58Var.f45097b);
                    for (Iterator it4 = j58Var.f45098c.iterator(); it4.hasNext(); it4 = it4) {
                        builderAddExtras.setAllowDataType((String) it4.next(), true);
                    }
                    builderAddExtras.setEditChoicesBeforeSending(0);
                    remoteInputArr[i4] = builderAddExtras.build();
                    i4++;
                    it2 = it3;
                    j58VarArr = j58VarArr2;
                }
                it = it2;
                for (int i5 = 0; i5 < length; i5++) {
                    builder2.addRemoteInput(remoteInputArr[i5]);
                }
            } else {
                it = it2;
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            builder2.setContextual(false);
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0780ao.m2942h(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", pm6Var.f56477e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f50861c).addAction(builder2.build());
            it2 = it;
            context2 = null;
        }
        Bundle bundle3 = vm6Var.f65594n;
        if (bundle3 != null) {
            ((Bundle) this.f50863e).putAll(bundle3);
        }
        ((Notification.Builder) this.f50861c).setShowWhen(vm6Var.f65591k);
        ((Notification.Builder) this.f50861c).setLocalOnly(vm6Var.f65593m);
        ((Notification.Builder) this.f50861c).setGroup(null);
        ((Notification.Builder) this.f50861c).setSortKey(null);
        ((Notification.Builder) this.f50861c).setGroupSummary(false);
        ((Notification.Builder) this.f50861c).setCategory(null);
        ((Notification.Builder) this.f50861c).setColor(vm6Var.f65595o);
        ((Notification.Builder) this.f50861c).setVisibility(vm6Var.f65596p);
        ((Notification.Builder) this.f50861c).setPublicVersion(null);
        ((Notification.Builder) this.f50861c).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = vm6Var.f65601u;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((Notification.Builder) this.f50861c).addPerson((String) it5.next());
            }
        }
        if (arrayList.size() > 0) {
            if (vm6Var.f65594n == null) {
                vm6Var.f65594n = new Bundle();
            }
            Bundle bundle4 = vm6Var.f65594n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList.size()) {
                String string = Integer.toString(i6);
                pm6 pm6Var2 = (pm6) arrayList.get(i6);
                Bundle bundle7 = new Bundle();
                if (pm6Var2.f56474b == null && (i2 = pm6Var2.f56478f) != 0) {
                    pm6Var2.f56474b = IconCompat.m1994a(i2);
                }
                IconCompat iconCompat3 = pm6Var2.f56474b;
                Bundle bundle8 = pm6Var2.f56473a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.m1995b() : 0);
                bundle7.putCharSequence("title", pm6Var2.f56479g);
                bundle7.putParcelable("actionIntent", pm6Var2.f56480h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean(str, pm6Var2.f56476d);
                bundle7.putBundle("extras", bundle9);
                j58[] j58VarArr3 = pm6Var2.f56475c;
                if (j58VarArr3 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[j58VarArr3.length];
                    int i7 = 0;
                    while (i7 < j58VarArr3.length) {
                        j58 j58Var2 = j58VarArr3[i7];
                        int i8 = i7;
                        Bundle bundle10 = new Bundle();
                        j58Var2.getClass();
                        int i9 = i6;
                        bundle10.putString("resultKey", str2);
                        String str3 = str2;
                        bundle10.putCharSequence("label", j58Var2.f45096a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", j58Var2.f45097b);
                        HashSet hashSet = j58Var2.f45098c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList3 = new ArrayList<>(hashSet.size());
                            Iterator it6 = hashSet.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add((String) it6.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList3);
                        }
                        bundleArr[i8] = bundle10;
                        i7 = i8 + 1;
                        i6 = i9;
                        str2 = str3;
                    }
                }
                int i10 = i6;
                String str4 = str2;
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", pm6Var2.f56477e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i6 = i10 + 1;
                arrayList = arrayList;
                str = str;
                str2 = str4;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (vm6Var.f65594n == null) {
                vm6Var.f65594n = new Bundle();
            }
            vm6Var.f65594n.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f50863e).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.f50861c).setExtras(vm6Var.f65594n);
        ((Notification.Builder) this.f50861c).setRemoteInputHistory(null);
        ((Notification.Builder) this.f50861c).setBadgeIconType(0);
        ((Notification.Builder) this.f50861c).setSettingsText(null);
        ((Notification.Builder) this.f50861c).setShortcutId(null);
        ((Notification.Builder) this.f50861c).setTimeoutAfter(0L);
        ((Notification.Builder) this.f50861c).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(vm6Var.f65597q)) {
            ((Notification.Builder) this.f50861c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it7 = vm6Var.f65583c.iterator();
        if (it7.hasNext()) {
            throw wq1.m24110f(it7);
        }
        ((Notification.Builder) this.f50861c).setAllowSystemGeneratedContextualActions(vm6Var.f65599s);
        ((Notification.Builder) this.f50861c).setBubbleMetadata(null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && (i = vm6Var.f65598r) != 0) {
            AbstractC0780ao.m2943i((Notification.Builder) this.f50861c, i);
        }
        if (i11 >= 36) {
            AbstractC3782y3.m24923f((Notification.Builder) this.f50861c);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        int[] iArr;
        cs1 cs1Var;
        int i3;
        int i4;
        int iM14842z;
        int i5;
        int i6;
        int iM14808C;
        c87 c87Var = (c87) this.f50862d;
        k47 k47Var = (k47) this.f50861c;
        k47 k47Var2 = (k47) this.f50860b;
        k47Var2.m14816K(i + i2, bArr);
        k47Var2.m14818M(i);
        if (((Inflater) this.f50863e) == null) {
            this.f50863e = new Inflater();
        }
        Inflater inflater = (Inflater) this.f50863e;
        String str = uma.f64080a;
        if (k47Var2.m14820a() > 0 && k47Var2.m14826j() == 120 && uma.m22827v(k47Var2, k47Var, inflater)) {
            k47Var2.m14816K(k47Var.f46702c, k47Var.f46700a);
        }
        int i7 = 0;
        c87Var.f9711d = 0;
        int[] iArr2 = c87Var.f9709b;
        k47 k47Var3 = c87Var.f9708a;
        c87Var.f9712e = 0;
        c87Var.f9713f = 0;
        c87Var.f9714g = 0;
        c87Var.f9715h = 0;
        c87Var.f9716i = 0;
        k47Var3.m14815J(0);
        c87Var.f9710c = false;
        ArrayList arrayList = new ArrayList();
        while (k47Var2.m14820a() >= 3) {
            int i8 = k47Var2.f46702c;
            int iM14842z2 = k47Var2.m14842z();
            int iM14812G = k47Var2.m14812G();
            int i9 = k47Var2.f46701b + iM14812G;
            if (i9 > i8) {
                k47Var2.m14818M(i8);
                i3 = i7;
                iArr = iArr2;
                cs1Var = null;
            } else {
                char c = 128;
                if (iM14842z2 != 128) {
                    switch (iM14842z2) {
                        case 20:
                            if (iM14812G % 5 == 2) {
                                k47Var2.m14819N(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iM14812G / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iM14842z3 = k47Var2.m14842z();
                                    char c2 = c;
                                    double dM14842z = k47Var2.m14842z();
                                    double dM14842z2 = k47Var2.m14842z() - 128;
                                    int[] iArr3 = iArr2;
                                    double dM14842z3 = k47Var2.m14842z() - 128;
                                    iArr3[iM14842z3] = uma.m22812g((int) ((dM14842z3 * 1.772d) + dM14842z), 0, 255) | (k47Var2.m14842z() << 24) | (uma.m22812g((int) ((1.402d * dM14842z2) + dM14842z), 0, 255) << 16) | (uma.m22812g((int) ((dM14842z - (0.34414d * dM14842z3)) - (dM14842z2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                c87Var.f9710c = true;
                            } else {
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iM14812G >= 4) {
                                k47Var2.m14819N(3);
                                int i12 = iM14812G - 4;
                                if (((128 & k47Var2.m14842z()) != 0 ? 1 : i7) == 0) {
                                    i5 = k47Var3.f46701b;
                                    i6 = k47Var3.f46702c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        k47Var2.m14827k(k47Var3.f46700a, i5, iMin);
                                        k47Var3.m14818M(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iM14808C = k47Var2.m14808C()) >= 4) {
                                    c87Var.f9715h = k47Var2.m14812G();
                                    c87Var.f9716i = k47Var2.m14812G();
                                    k47Var3.m14815J(iM14808C - 4);
                                    i12 = iM14812G - 11;
                                    i5 = k47Var3.f46701b;
                                    i6 = k47Var3.f46702c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        k47Var2.m14827k(k47Var3.f46700a, i5, iMin2);
                                        k47Var3.m14818M(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iM14812G >= 19) {
                                c87Var.f9711d = k47Var2.m14812G();
                                c87Var.f9712e = k47Var2.m14812G();
                                k47Var2.m14819N(11);
                                c87Var.f9713f = k47Var2.m14812G();
                                c87Var.f9714g = k47Var2.m14812G();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    cs1Var = null;
                    i3 = 0;
                } else {
                    iArr = iArr2;
                    if (c87Var.f9711d == 0 || c87Var.f9712e == 0 || c87Var.f9715h == 0 || c87Var.f9716i == 0 || (i4 = k47Var3.f46702c) == 0 || k47Var3.f46701b != i4 || !c87Var.f9710c) {
                        cs1Var = null;
                    } else {
                        k47Var3.m14818M(0);
                        int i13 = c87Var.f9715h * c87Var.f9716i;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iM14842z4 = k47Var3.m14842z();
                            if (iM14842z4 != 0) {
                                iM14842z = i14 + 1;
                                iArr4[i14] = iArr[iM14842z4];
                            } else {
                                int iM14842z5 = k47Var3.m14842z();
                                if (iM14842z5 != 0) {
                                    iM14842z = ((iM14842z5 & 64) == 0 ? iM14842z5 & 63 : ((iM14842z5 & 63) << 8) | k47Var3.m14842z()) + i14;
                                    Arrays.fill(iArr4, i14, iM14842z, (iM14842z5 & 128) == 0 ? iArr[0] : iArr[k47Var3.m14842z()]);
                                }
                            }
                            i14 = iM14842z;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, c87Var.f9715h, c87Var.f9716i, Bitmap.Config.ARGB_8888);
                        float f = c87Var.f9713f;
                        float f2 = c87Var.f9711d;
                        float f3 = f / f2;
                        float f4 = c87Var.f9714g;
                        float f5 = c87Var.f9712e;
                        cs1Var = new cs1(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, c87Var.f9715h / f2, c87Var.f9716i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    c87Var.f9711d = 0;
                    c87Var.f9712e = 0;
                    c87Var.f9713f = 0;
                    c87Var.f9714g = 0;
                    c87Var.f9715h = 0;
                    c87Var.f9716i = 0;
                    k47Var3.m14815J(0);
                    c87Var.f9710c = false;
                }
                k47Var2.m14818M(i9);
            }
            if (cs1Var != null) {
                arrayList.add(cs1Var);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        kk1Var.accept(new gs1(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* JADX INFO: renamed from: a */
    public C3403ob m16724a() {
        Integer num = (Integer) this.f50860b;
        if (num == null) {
            v63.m23147y("Key size is not set");
            return null;
        }
        if (((Integer) this.f50861c) == null) {
            v63.m23147y("IV size is not set");
            return null;
        }
        if (((Integer) this.f50862d) != null) {
            return new C3403ob(num.intValue(), ((Integer) this.f50861c).intValue(), ((Integer) this.f50862d).intValue(), (C3366nb) this.f50863e);
        }
        v63.m23147y("Tag size is not set");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public lu3 m16725b() {
        Integer num = (Integer) this.f50860b;
        if (num == null) {
            v63.m23147y("key size is not set");
            return null;
        }
        if (((Integer) this.f50861c) == null) {
            v63.m23147y("tag size is not set");
            return null;
        }
        if (((fo2) this.f50862d) == null) {
            v63.m23147y("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f50860b));
        }
        Integer num2 = (Integer) this.f50861c;
        int iIntValue = num2.intValue();
        fo2 fo2Var = (fo2) this.f50862d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (fo2Var == fo2.f39363e) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (fo2Var == fo2.f39364f) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (fo2Var == fo2.f39365g) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (fo2Var == fo2.f39366h) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (fo2Var != fo2.f39367i) {
                v63.m23147y("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new lu3(((Integer) this.f50860b).intValue(), ((Integer) this.f50861c).intValue(), (C2920da) this.f50863e, (fo2) this.f50862d);
    }

    /* JADX INFO: renamed from: c */
    public void m16726c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            ho2.m13385e("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((l79) this.f50861c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m16726c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        int i = 3;
        switch (this.f50859a) {
            case 21:
                rkd rkdVar = (rkd) this.f50860b;
                int i2 = 0;
                C3780y1 c3780y1M6403g = AbstractC1118h.m6403g((ListenableFuture) this.f50861c, new nkd(rkdVar, i2), AbstractC1120j.m6404a());
                C3780y1 c3780y1M6403g2 = AbstractC1118h.m6403g(c3780y1M6403g, (ubd) this.f50862d, (Executor) this.f50863e);
                pkd pkdVar = new pkd(rkdVar, c3780y1M6403g, c3780y1M6403g2, i2);
                int i3 = jmd.f45851a;
                return AbstractC1118h.m6403g(c3780y1M6403g2, new ubd(i, qld.m20020a(), pkdVar), AbstractC1120j.m6404a());
            default:
                pkd pkdVar2 = new pkd((ckd) this.f50860b, (ubd) this.f50862d, (Executor) this.f50863e, 1);
                int i4 = jmd.f45851a;
                return AbstractC1118h.m6403g((AbstractC1112b) this.f50861c, new ubd(i, qld.m20020a(), pkdVar2), AbstractC1120j.m6404a());
        }
    }

    /* JADX INFO: renamed from: d */
    public qn9 m16727d(AbstractC0799b6 abstractC0799b6) {
        ArrayList arrayList = (ArrayList) this.f50862d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qn9 qn9Var = (qn9) arrayList.get(i);
            if (qn9Var != null && qn9Var.f57991b == abstractC0799b6) {
                return qn9Var;
            }
        }
        qn9 qn9Var2 = new qn9((Context) this.f50861c, abstractC0799b6);
        arrayList.add(qn9Var2);
        return qn9Var2;
    }

    /* JADX INFO: renamed from: e */
    public int m16728e() {
        HashSet hashSet = (HashSet) this.f50862d;
        return (int) ((((double) hashSet.size()) / ((double) (((HashSet) this.f50863e).size() + hashSet.size()))) * 100.0d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m16729f(AbstractC0799b6 abstractC0799b6, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f50860b).onActionItemClicked(m16727d(abstractC0799b6), new qw5((Context) this.f50861c, (vn9) menuItem));
    }

    /* JADX INFO: renamed from: g */
    public boolean m16730g(AbstractC0799b6 abstractC0799b6, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f50860b;
        qn9 qn9VarM16727d = m16727d(abstractC0799b6);
        l79 l79Var = (l79) this.f50863e;
        Menu jx5Var = (Menu) l79Var.get(menu);
        if (jx5Var == null) {
            jx5Var = new jx5((Context) this.f50861c, (hw5) menu);
            l79Var.put(menu, jx5Var);
        }
        return callback.onCreateActionMode(qn9VarM16727d, jx5Var);
    }

    /* JADX INFO: renamed from: h */
    public void m16731h(int i) {
        switch (this.f50859a) {
            case 0:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f50860b = Integer.valueOf(i);
                return;
            default:
                this.f50860b = Integer.valueOf(i);
                return;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m16732j() {
        int iMo6133a;
        sua suaVar = (sua) this.f50861c;
        vf9 vf9Var = (vf9) this.f50860b;
        ViewPager2 viewPager2 = (ViewPager2) this.f50863e;
        int i = R.id.accessibilityActionPageLeft;
        dta.m10638i(viewPager2, R.id.accessibilityActionPageLeft);
        dta.m10636g(viewPager2, 0);
        dta.m10638i(viewPager2, R.id.accessibilityActionPageRight);
        dta.m10636g(viewPager2, 0);
        dta.m10638i(viewPager2, R.id.accessibilityActionPageUp);
        dta.m10636g(viewPager2, 0);
        dta.m10638i(viewPager2, R.id.accessibilityActionPageDown);
        dta.m10636g(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iMo6133a = viewPager2.getAdapter().mo6133a()) == 0 || !viewPager2.f7115M) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f7121d < iMo6133a - 1) {
                dta.m10639j(viewPager2, new C3671v3(R.id.accessibilityActionPageDown, (String) null), vf9Var);
            }
            if (viewPager2.f7121d > 0) {
                dta.m10639j(viewPager2, new C3671v3(R.id.accessibilityActionPageUp, (String) null), suaVar);
                return;
            }
            return;
        }
        boolean z = viewPager2.f7124g.f69172b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.f7121d < iMo6133a - 1) {
            dta.m10639j(viewPager2, new C3671v3(i2, (String) null), vf9Var);
        }
        if (viewPager2.f7121d > 0) {
            dta.m10639j(viewPager2, new C3671v3(i, (String) null), suaVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public kmb m16733k(C3329mb c3329mb, koc... kocVarArr) {
        kmb kmbVarM23241c = kmb.f47523y;
        for (koc kocVar : kocVarArr) {
            kmbVarM23241c = vdd.m23241c(kocVar);
            qdd.m19885l((C3329mb) this.f50862d);
            if ((kmbVarM23241c instanceof rmb) || (kmbVarM23241c instanceof gmb)) {
                kmbVarM23241c = ((cdb) this.f50860b).m4562k(c3329mb, kmbVarM23241c);
            }
        }
        return kmbVarM23241c;
    }

    /* JADX INFO: renamed from: l */
    public kmb m16734l(kmb kmbVar) {
        return ((cdb) this.f50861c).m4562k(this, kmbVar);
    }

    /* JADX INFO: renamed from: m */
    public kmb m16735m(cib cibVar) {
        kmb kmbVarM4562k = kmb.f47523y;
        Iterator itM4743m = cibVar.m4743m();
        while (itM4743m.hasNext()) {
            kmbVarM4562k = ((cdb) this.f50861c).m4562k(this, cibVar.m4745o(((Integer) itM4743m.next()).intValue()));
            if (kmbVarM4562k instanceof jjb) {
                break;
            }
        }
        return kmbVarM4562k;
    }

    /* JADX INFO: renamed from: n */
    public C3329mb m16736n() {
        return new C3329mb(this, (cdb) this.f50861c);
    }

    /* JADX INFO: renamed from: o */
    public boolean m16737o(String str) {
        if (((HashMap) this.f50862d).containsKey(str)) {
            return true;
        }
        C3329mb c3329mb = (C3329mb) this.f50860b;
        if (c3329mb != null) {
            return c3329mb.m16737o(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m16738p(String str, kmb kmbVar) {
        C3329mb c3329mb;
        HashMap map = (HashMap) this.f50862d;
        if (!map.containsKey(str) && (c3329mb = (C3329mb) this.f50860b) != null && c3329mb.m16737o(str)) {
            c3329mb.m16738p(str, kmbVar);
        } else {
            if (((HashMap) this.f50863e).containsKey(str)) {
                return;
            }
            if (kmbVar == null) {
                map.remove(str);
            } else {
                map.put(str, kmbVar);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16739q(String str, kmb kmbVar) {
        if (((HashMap) this.f50863e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f50862d;
        if (kmbVar == null) {
            map.remove(str);
        } else {
            map.put(str, kmbVar);
        }
    }

    /* JADX INFO: renamed from: r */
    public kmb m16740r(String str) {
        HashMap map = (HashMap) this.f50862d;
        if (map.containsKey(str)) {
            return (kmb) map.get(str);
        }
        C3329mb c3329mb = (C3329mb) this.f50860b;
        if (c3329mb != null) {
            return c3329mb.m16740r(str);
        }
        C3386nv.m17626m(ux5.m22990m(str, " is not defined"));
        return null;
    }

    public /* synthetic */ C3329mb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f50859a = i;
        this.f50860b = obj;
        this.f50861c = obj2;
        this.f50862d = obj3;
        this.f50863e = obj4;
    }

    public C3329mb(C3329mb c3329mb, cdb cdbVar) {
        this.f50859a = 19;
        this.f50862d = new HashMap();
        this.f50863e = new HashMap();
        this.f50860b = c3329mb;
        this.f50861c = cdbVar;
    }

    public C3329mb(String str, String str2, Locale locale) {
        this.f50859a = 14;
        locale.getClass();
        str.getClass();
        str2.getClass();
        this.f50860b = locale;
        this.f50861c = str;
        this.f50862d = new HashSet();
        this.f50863e = new HashSet();
        this.f50861c = vz1.m23610P((String) this.f50861c, locale);
        String strM23610P = vz1.m23610P(str2, locale);
        int length = ((String) this.f50861c).length();
        int length2 = strM23610P.length();
        char[] charArray = ((String) this.f50861c).toCharArray();
        charArray.getClass();
        char[] charArray2 = strM23610P.toCharArray();
        charArray2.getClass();
        int i = length + 1;
        int[][] iArr = new int[i][];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = new int[length2 + 1];
        }
        for (int i4 = length - 1; -1 < i4; i4--) {
            for (int i5 = length2 - 1; -1 < i5; i5--) {
                if (cl9.m4834Q(String.valueOf(charArray[i4]), String.valueOf(charArray2[i5]), true)) {
                    iArr[i4][i5] = iArr[i4 + 1][i5 + 1] + 1;
                } else {
                    int[] iArr2 = iArr[i4];
                    int i6 = iArr[i4 + 1][i5];
                    int i7 = iArr2[i5 + 1];
                    iArr2[i5] = i6 < i7 ? i7 : i6;
                }
            }
        }
        char[] cArr = new char[iArr[0][0]];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length && i9 < length2) {
            char c = charArray[i8];
            if (c == charArray2[i9]) {
                i8++;
                cArr[i10] = c;
                i9++;
                i10++;
            } else {
                int i11 = i8 + 1;
                int i12 = i9 + 1;
                if (iArr[i11][i9] > iArr[i8][i12]) {
                    i8 = i11;
                } else {
                    i9 = i12;
                }
            }
        }
        String str3 = new String(cArr);
        HashSet hashSet = (HashSet) this.f50862d;
        hashSet.clear();
        HashSet hashSet2 = (HashSet) this.f50863e;
        hashSet2.clear();
        Locale locale2 = (Locale) this.f50860b;
        String string = vk9.m23376L0(vz1.m23610P(str3, locale2)).toString();
        if (fa4.m11650l(string, (String) this.f50861c)) {
            ux8 ux8VarM15417m0 = AbstractC3204c.m15417m0(new qk9(i2, new Ref$IntRef(), this));
            HashSet hashSet3 = new HashSet();
            Iterator it = ((aj1) ux8VarM15417m0).iterator();
            while (it.hasNext()) {
                hashSet3.add(it.next());
            }
            hashSet.addAll(hashSet3);
            return;
        }
        List listM23365A0 = vk9.m23365A0(string, new String[]{" "}, 0, 6);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listM23365A0) {
            if (!vk9.m23391n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str4 : arrayList) {
            try {
                bl3 bl3VarM17147z = AbstractC3352my.m17147z((String) this.f50861c, str4);
                if (((ux8) bl3VarM17147z.f8659c).iterator().hasNext() && ((Number) AbstractC3204c.m15414j0(bl3VarM17147z)).intValue() >= 0) {
                    int iIntValue = ((Number) AbstractC3204c.m15414j0(bl3VarM17147z)).intValue();
                    int iIntValue2 = ((Number) AbstractC3204c.m15414j0(bl3VarM17147z)).intValue() + str4.length();
                    while (iIntValue < iIntValue2) {
                        hashSet.add(Integer.valueOf(iIntValue));
                        String str5 = (String) this.f50861c;
                        str5.getClass();
                        int i13 = iIntValue + 1;
                        this.f50861c = vk9.m23400w0(str5, iIntValue, i13, " ").toString();
                        iIntValue = i13;
                    }
                    bl3 bl3VarM17147z2 = AbstractC3352my.m17147z(string, str4);
                    if (((ux8) bl3VarM17147z2.f8659c).iterator().hasNext() && ((Number) AbstractC3204c.m15414j0(bl3VarM17147z2)).intValue() >= 0) {
                        int iIntValue3 = ((Number) AbstractC3204c.m15414j0(bl3VarM17147z2)).intValue();
                        int iIntValue4 = ((Number) AbstractC3204c.m15414j0(bl3VarM17147z2)).intValue() + str4.length();
                        while (iIntValue3 < iIntValue4) {
                            int i14 = iIntValue3 + 1;
                            string = vk9.m23400w0(string, iIntValue3, i14, " ").toString();
                            iIntValue3 = i14;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String str6 = (String) this.f50861c;
        int i15 = 0;
        int i16 = 0;
        while (i15 < str6.length()) {
            char cCharAt = str6.charAt(i15);
            int i17 = i16 + 1;
            if (!hashSet.contains(Integer.valueOf(i16))) {
                int length3 = string.length();
                int i18 = 0;
                while (true) {
                    if (i18 >= length3) {
                        i18 = -1;
                        break;
                    }
                    char cCharAt2 = string.charAt(i18);
                    if (cCharAt2 != ' ' && vz1.m23610P(String.valueOf(cCharAt2), locale2).equals(vz1.m23610P(String.valueOf(cCharAt), locale2))) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 == -1 && !vk9.m23391n0(String.valueOf(cCharAt))) {
                    hashSet2.add(Integer.valueOf(i16));
                } else if (i18 > -1) {
                    string = cl9.m4840W(string, cCharAt, ' ');
                    hashSet.add(Integer.valueOf(i16));
                }
            }
            i15++;
            i16 = i17;
        }
    }

    public C3329mb(int i) {
        this.f50859a = i;
        switch (i) {
            case 5:
                this.f50860b = new jh7(10);
                this.f50861c = new l79(0);
                this.f50862d = new ArrayList();
                this.f50863e = new HashSet();
                break;
            case 7:
                this.f50860b = null;
                this.f50861c = null;
                this.f50862d = null;
                this.f50863e = C2920da.f35233l;
                break;
            case 12:
                this.f50860b = new k47();
                this.f50861c = new k47();
                this.f50862d = new c87();
                break;
            case 17:
                this.f50860b = new CopyOnWriteArrayList();
                this.f50861c = new CopyOnWriteArrayList();
                this.f50862d = new CopyOnWriteArrayList();
                this.f50863e = new CopyOnWriteArrayList();
                break;
            case 18:
                cdb cdbVar = new cdb(7);
                this.f50860b = cdbVar;
                C3329mb c3329mb = new C3329mb((C3329mb) null, cdbVar);
                this.f50862d = c3329mb;
                this.f50861c = c3329mb.m16736n();
                jh9 jh9Var = new jh9(8);
                this.f50863e = jh9Var;
                c3329mb.m16738p("require", new sld(jh9Var));
                jh9Var.m14478o("internal.platform", dob.f35976c);
                c3329mb.m16738p("runtime.counter", new bkb(Double.valueOf(0.0d)));
                break;
            default:
                this.f50860b = null;
                this.f50861c = null;
                this.f50862d = null;
                this.f50863e = C3366nb.f52551e;
                break;
        }
    }

    public /* synthetic */ C3329mb(int i, boolean z) {
        this.f50859a = i;
    }

    public C3329mb(Typeface typeface, ly5 ly5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f50859a = 9;
        this.f50863e = typeface;
        this.f50860b = ly5Var;
        this.f50862d = new oy5(1024);
        int iM22869a = ly5Var.m22869a(6);
        if (iM22869a != 0) {
            int i5 = iM22869a + ly5Var.f64229a;
            i = ((ByteBuffer) ly5Var.f64232d).getInt(((ByteBuffer) ly5Var.f64232d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f50861c = new char[i * 2];
        int iM22869a2 = ly5Var.m22869a(6);
        if (iM22869a2 != 0) {
            int i6 = iM22869a2 + ly5Var.f64229a;
            i2 = ((ByteBuffer) ly5Var.f64232d).getInt(((ByteBuffer) ly5Var.f64232d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            rda rdaVar = new rda(this, i7);
            ky5 ky5VarM20595b = rdaVar.m20595b();
            int iM22869a3 = ky5VarM20595b.m22869a(4);
            Character.toChars(iM22869a3 != 0 ? ((ByteBuffer) ky5VarM20595b.f64232d).getInt(iM22869a3 + ky5VarM20595b.f64229a) : 0, (char[]) this.f50861c, i7 * 2);
            ky5 ky5VarM20595b2 = rdaVar.m20595b();
            int iM22869a4 = ky5VarM20595b2.m22869a(16);
            if (iM22869a4 != 0) {
                int i8 = iM22869a4 + ky5VarM20595b2.f64229a;
                i3 = ((ByteBuffer) ky5VarM20595b2.f64232d).getInt(((ByteBuffer) ky5VarM20595b2.f64232d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            xwc.m24774l("invalid metadata codepoint length", i3 > 0);
            oy5 oy5Var = (oy5) this.f50862d;
            ky5 ky5VarM20595b3 = rdaVar.m20595b();
            int iM22869a5 = ky5VarM20595b3.m22869a(16);
            if (iM22869a5 != 0) {
                int i9 = iM22869a5 + ky5VarM20595b3.f64229a;
                i4 = ((ByteBuffer) ky5VarM20595b3.f64232d).getInt(((ByteBuffer) ky5VarM20595b3.f64232d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            oy5Var.m18839a(rdaVar, 0, i4 - 1);
        }
    }

    public C3329mb(Context context, ActionMode.Callback callback) {
        this.f50859a = 15;
        this.f50861c = context;
        this.f50860b = callback;
        this.f50862d = new ArrayList();
        this.f50863e = new l79(0);
    }

    public C3329mb(List list, h76 h76Var, h76 h76Var2, h76 h76Var3) {
        this.f50859a = 10;
        this.f50860b = list != null ? ImmutableList.m6287r(list) : ImmutableList.m6289v();
        this.f50861c = h76Var;
        this.f50862d = h76Var2;
        this.f50863e = h76Var3;
    }

    public C3329mb(AudioTrack audioTrack, qn3 qn3Var) {
        this.f50859a = 2;
        this.f50860b = audioTrack;
        this.f50861c = qn3Var;
        Handler handlerM22816k = uma.m22816k(null);
        this.f50862d = handlerM22816k;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: vz
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C3329mb c3329mb = this.f66105a;
                if (((C3703vz) c3329mb.f50863e) == null) {
                    return;
                }
                l70.m15956s().execute(new RunnableC0806bd(9, c3329mb, audioRouting));
            }
        };
        this.f50863e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerM22816k);
    }

    public C3329mb(ViewPager2 viewPager2) {
        this.f50859a = 16;
        this.f50863e = viewPager2;
        this.f50860b = new vf9(this);
        this.f50861c = new sua(this, 0);
    }

    public C3329mb(k8a k8aVar, boolean[] zArr) {
        this.f50859a = 13;
        this.f50860b = k8aVar;
        this.f50861c = zArr;
        int i = k8aVar.f46868a;
        this.f50862d = new boolean[i];
        this.f50863e = new boolean[i];
    }
}
