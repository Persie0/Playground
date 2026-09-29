package p000;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class te9 {

    /* JADX INFO: renamed from: a */
    public static final ImmutableList f62200a = ImmutableList.m6291y(12);

    /* JADX INFO: renamed from: a */
    public static ImmutableList m22015a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new C3775xx()).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileM16195e = AbstractC3298lh.m16195e(it.next());
            if (audioProfileM16195e.getEncapsulationType() != 1 && uma.m22830y(audioProfileM16195e.getFormat())) {
                for (int i : audioProfileM16195e.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.m6287r(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static ImmutableList m22016b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        ImmutableList immutableListM22015a;
        ImmutableList immutableListM6289v;
        int speakerLayoutChannelMask;
        boolean zM25536a = zad.m25536a(audioDeviceInfo.getType());
        ImmutableList immutableList = f62200a;
        if (!zM25536a) {
            if (audioDeviceInfo.getType() == 1) {
                return ImmutableList.m6291y(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return ImmutableList.m6291y(Integer.valueOf(speakerLayoutChannelMask));
                }
                ss5.m21707d0("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return immutableList;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                ImmutableList immutableListM22015a2 = m22015a(audioDeviceInfo);
                if (!immutableListM22015a2.isEmpty()) {
                    return immutableListM22015a2;
                }
                ImmutableList immutableListM122b = a4d.m122b(audioDeviceInfo.getAudioDescriptors());
                if (!immutableListM122b.isEmpty()) {
                    return immutableListM122b;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    ImmutableList immutableListM22015a3 = m22015a(audioDeviceInfo);
                    if (!immutableListM22015a3.isEmpty()) {
                        return immutableListM22015a3;
                    }
                    List audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            immutableListM6289v = ImmutableList.m6289v();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorM16194d = AbstractC3298lh.m16194d(it.next());
                                if (audioDescriptorM16194d.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorM16194d.getDescriptor();
                                    if (descriptor.length != 3) {
                                        ss5.m21707d0("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b = descriptor[0];
                                            i2 = (b & 1) != 0 ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                i2 |= 1024;
                                            }
                                            if ((b & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i2 |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            arrayList.sort(new C3166k(1));
                            immutableListM6289v = ImmutableList.m6287r(arrayList);
                        }
                        if (!immutableListM6289v.isEmpty()) {
                            return immutableListM6289v;
                        }
                    }
                    ImmutableList immutableListM122b2 = a4d.m122b(audioDescriptors);
                    if (!immutableListM122b2.isEmpty()) {
                        return immutableListM122b2;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    immutableListM22015a = m22015a(audioDeviceInfo);
                    if (!immutableListM22015a.isEmpty()) {
                        return immutableListM22015a;
                    }
                }
            } else if (i >= 31) {
                immutableListM22015a = m22015a(audioDeviceInfo);
                if (!immutableListM22015a.isEmpty()) {
                    return immutableListM22015a;
                }
            }
        }
        return immutableList;
    }
}
