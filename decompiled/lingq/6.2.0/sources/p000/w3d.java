package p000;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w3d {
    /* JADX INFO: renamed from: a */
    public static ImmutableList m23701a(C3476px c3476px) {
        c14 c14VarM6284m = ImmutableList.m6284m();
        bga it = C3627tx.f63031h.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= uma.m22817l(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c3476px.m19557a())) {
                c14VarM6284m.m3157b(num);
            }
        }
        c14VarM6284m.m3157b(2);
        return c14VarM6284m.m4280g();
    }

    /* JADX INFO: renamed from: b */
    public static int m23702b(int i, int i2, C3476px c3476px) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM22818m = uma.m22818m(i3);
            if (iM22818m != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM22818m).build(), c3476px.m19557a())) {
                return i3;
            }
        }
        return 0;
    }
}
