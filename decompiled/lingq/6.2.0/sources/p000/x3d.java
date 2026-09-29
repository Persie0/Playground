package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.AbstractC1110a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x3d {
    /* JADX INFO: renamed from: a */
    public static C3627tx m24262a(AudioManager audioManager, C3476px c3476px, ImmutableList immutableList, List list) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c3476px.m19557a());
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC1110a.m6361a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfileM16195e = AbstractC3298lh.m16195e(directProfilesForAttributes.get(i));
            if (audioProfileM16195e.getEncapsulationType() != 1) {
                int format = audioProfileM16195e.getFormat();
                if (uma.m22830y(format) || C3627tx.f63031h.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC1110a.m6361a(audioProfileM16195e.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC1110a.m6361a(audioProfileM16195e.getChannelMasks())));
                    }
                }
            }
        }
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (Map.Entry entry : map.entrySet()) {
            c14VarM6284m.m3157b(new C3590sx(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C3627tx(c14VarM6284m.m4280g(), immutableList, list);
    }

    /* JADX INFO: renamed from: b */
    public static AudioDeviceInfo m24263b(AudioManager audioManager, C3476px c3476px) {
        audioManager.getClass();
        List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c3476px.m19557a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
    }
}
