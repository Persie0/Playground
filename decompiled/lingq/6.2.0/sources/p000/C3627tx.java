package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C0713b;
import com.google.common.collect.C1097m;
import com.google.common.collect.C1098n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.AbstractC1110a;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: tx */
/* JADX INFO: loaded from: classes.dex */
public final class C3627tx {

    /* JADX INFO: renamed from: e */
    public static final ImmutableList f63028e;

    /* JADX INFO: renamed from: f */
    public static final C3627tx f63029f;

    /* JADX INFO: renamed from: g */
    public static final ImmutableList f63030g;

    /* JADX INFO: renamed from: h */
    public static final ImmutableMap f63031h;

    /* JADX INFO: renamed from: a */
    public final SparseArray f63032a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f63033b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList f63034c;

    /* JADX INFO: renamed from: d */
    public final ImmutableList f63035d;

    static {
        ImmutableList immutableListM6291y = ImmutableList.m6291y(12);
        f63028e = immutableListM6291y;
        f63029f = new C3627tx(ImmutableList.m6291y(C3590sx.f61524d), immutableListM6291y, ImmutableList.m6289v());
        Object[] objArr = {2, 5, 6};
        d32.m10011I(objArr, 3);
        f63030g = ImmutableList.m6283l(objArr, 3);
        C1097m c1097m = new C1097m(4);
        c1097m.m6340b(5, 6);
        c1097m.m6340b(17, 6);
        c1097m.m6340b(7, 6);
        c1097m.m6340b(30, 10);
        c1097m.m6340b(18, 6);
        c1097m.m6340b(6, 8);
        c1097m.m6340b(8, 8);
        c1097m.m6340b(14, 8);
        f63031h = c1097m.m6339a(true);
    }

    public C3627tx(List list, List list2, List list3) {
        for (int i = 0; i < list.size(); i++) {
            C3590sx c3590sx = (C3590sx) list.get(i);
            this.f63032a.put(c3590sx.f61525a, c3590sx);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f63032a.size(); i2++) {
            iMax = Math.max(iMax, ((C3590sx) this.f63032a.valueAt(i2)).f61526b);
        }
        this.f63033b = iMax;
        this.f63034c = ImmutableList.m6287r(list2);
        this.f63035d = ImmutableList.m6287r(list3);
    }

    /* JADX INFO: renamed from: a */
    public static ImmutableList m22331a(int[] iArr, int i) {
        c14 c14VarM6284m = ImmutableList.m6284m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            c14VarM6284m.m3157b(new C3590sx(i2, i));
        }
        return c14VarM6284m.m4280g();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX INFO: renamed from: b */
    public static C3627tx m22332b(Context context, Intent intent, C3476px c3476px, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerM17083B = AbstractC3352my.m17083B(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? x3d.m24263b(audioManagerM17083B, c3476px) : null;
        }
        ImmutableList immutableListM22016b = audioDeviceInfo != null ? te9.m22016b(audioDeviceInfo) : f63028e;
        if (Build.VERSION.SDK_INT >= 33 && (uma.m22796A(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return x3d.m24262a(audioManagerM17083B, c3476px, immutableListM22016b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerM17083B.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (zad.m25536a(audioDeviceInfo2.getType())) {
                return new C3627tx(ImmutableList.m6291y(C3590sx.f61524d), immutableListM22016b, list);
            }
        }
        C1098n c1098n = new C1098n(4);
        c1098n.m3157b(2);
        if (uma.m22796A(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            ImmutableList immutableListM23701a = w3d.m23701a(c3476px);
            immutableListM23701a.getClass();
            c1098n.m3159d(immutableListM23701a);
            return new C3627tx(m22331a(AbstractC1110a.m6365e(c1098n.mo6343h()), 10), immutableListM22016b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    ImmutableList immutableList = f63030g;
                    immutableList.getClass();
                    c1098n.m3159d(immutableList);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            ImmutableList immutableList2 = f63030g;
            immutableList2.getClass();
            c1098n.m3159d(immutableList2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C3627tx(m22331a(AbstractC1110a.m6365e(c1098n.mo6343h()), 10), immutableListM22016b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listM6361a = AbstractC1110a.m6361a(intArrayExtra);
            listM6361a.getClass();
            c1098n.m3159d(listM6361a);
        }
        return new C3627tx(m22331a(AbstractC1110a.m6365e(c1098n.mo6343h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), immutableListM22016b, list);
    }

    /* JADX INFO: renamed from: c */
    public final Pair m22333c(C0713b c0713b, C3476px c3476px) {
        String str = c0713b.f6406o;
        str.getClass();
        int iM11392b = ez5.m11392b(str, c0713b.f6402k);
        if (!f63031h.containsKey(Integer.valueOf(iM11392b))) {
            return null;
        }
        SparseArray sparseArray = this.f63032a;
        if (iM11392b == 18 && !uma.m22814i(sparseArray, 18)) {
            iM11392b = 6;
        } else if ((iM11392b == 8 && !uma.m22814i(sparseArray, 8)) || (iM11392b == 30 && !uma.m22814i(sparseArray, 30))) {
            iM11392b = 7;
        }
        if (!uma.m22814i(sparseArray, iM11392b)) {
            return null;
        }
        C3590sx c3590sx = (C3590sx) sparseArray.get(iM11392b);
        c3590sx.getClass();
        int iM23702b = c3590sx.f61526b;
        ImmutableSet immutableSet = c3590sx.f61527c;
        int i = c0713b.f6381G;
        if (i == -1 || iM11392b == 18) {
            int i2 = c0713b.f6382H;
            if (i2 == -1) {
                i2 = 48000;
            }
            if (immutableSet == null) {
                iM23702b = w3d.m23702b(c3590sx.f61525a, i2, c3476px);
            }
            i = iM23702b;
        } else if (!c0713b.f6406o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            boolean zContains = false;
            if (immutableSet != null) {
                int iM22818m = uma.m22818m(i);
                if (iM22818m != 0) {
                    zContains = immutableSet.contains(Integer.valueOf(iM22818m));
                }
            } else if (i <= iM23702b) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i > 10) {
            return null;
        }
        int iM22818m2 = uma.m22818m(i);
        if (iM22818m2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM11392b), Integer.valueOf(iM22818m2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C3627tx) {
                C3627tx c3627tx = (C3627tx) obj;
                SparseArray sparseArray = c3627tx.f63032a;
                String str = uma.f64080a;
                SparseArray sparseArray2 = this.f63032a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    i++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f63033b != c3627tx.f63033b || !Objects.equals(this.f63034c, c3627tx.f63034c) || !Objects.equals(this.f63035d, c3627tx.f63035d)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f63033b * 31;
        String str = uma.f64080a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f63032a;
        if (i2 >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
        }
        return Objects.hashCode(this.f63035d) + ((Objects.hashCode(this.f63034c) + ((i + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f63033b + ", audioProfiles=" + this.f63032a + ", speakerLayoutChannelMasks=" + this.f63034c + ", spatializerChannelMasks=" + this.f63035d + "]";
    }
}
