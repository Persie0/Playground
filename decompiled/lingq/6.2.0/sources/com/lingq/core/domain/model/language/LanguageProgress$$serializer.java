package com.lingq.core.domain.model.language;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.dj2;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageProgress$$serializer implements zk3 {
    public static final LanguageProgress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageProgress$$serializer languageProgress$$serializer = new LanguageProgress$$serializer();
        INSTANCE = languageProgress$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageProgress", languageProgress$$serializer, 24);
        bg7Var.m3702k("interval", false);
        bg7Var.m3702k("languageCode", false);
        bg7Var.m3702k("writtenWordsGoal", true);
        bg7Var.m3702k("speakingTimeGoal", true);
        bg7Var.m3702k("totalWordsKnown", true);
        bg7Var.m3702k("readWords", true);
        bg7Var.m3702k("totalCards", true);
        bg7Var.m3702k("activityIndex", true);
        bg7Var.m3702k("knownWordsGoal", true);
        bg7Var.m3702k("listeningTimeGoal", true);
        bg7Var.m3702k("speakingTime", true);
        bg7Var.m3702k("cardsCreatedGoal", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("intervals", true);
        bg7Var.m3702k("cardsCreated", true);
        bg7Var.m3702k("readWordsGoal", true);
        bg7Var.m3702k("listeningTime", true);
        bg7Var.m3702k("cardsLearned", true);
        bg7Var.m3702k("writtenWords", true);
        bg7Var.m3702k("cardsLearnedGoal", true);
        bg7Var.m3702k("earnedCoins", true);
        bg7Var.m3702k("earnedCoinsGoal", true);
        bg7Var.m3702k("wpm", true);
        bg7Var.m3702k("studyTime", true);
        descriptor = bg7Var;
    }

    private LanguageProgress$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LanguageProgress.f19046y;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, dj2Var, l84Var, dj2Var, l84Var, l84Var, l84Var, dj2Var, dj2Var, l84Var, l84Var, cs4VarArr[13].getValue(), l84Var, l84Var, dj2Var, l84Var, l84Var, l84Var, l84Var, l84Var, l84Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageProgress deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LanguageProgress.f19046y;
        LanguageProgress languageProgress = null;
        int i2 = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        int iMo4091q6 = 0;
        int iMo4091q7 = 0;
        int iMo4091q8 = 0;
        int iMo4091q9 = 0;
        int iMo4091q10 = 0;
        int iMo4091q11 = 0;
        int iMo4091q12 = 0;
        int iMo4091q13 = 0;
        int iMo4091q14 = 0;
        int iMo4091q15 = 0;
        int iMo4091q16 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        double dMo4072F3 = 0.0d;
        double dMo4072F4 = 0.0d;
        double dMo4072F5 = 0.0d;
        boolean z = true;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i2 |= 1;
                    languageProgress = null;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i2 |= 2;
                    languageProgress = null;
                    break;
                case 2:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i2 |= 4;
                    languageProgress = null;
                    break;
                case 3:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 3);
                    i2 |= 8;
                    languageProgress = null;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i2 |= 16;
                    languageProgress = null;
                    break;
                case 5:
                    dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 5);
                    i2 |= 32;
                    languageProgress = null;
                    break;
                case 6:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i2 |= 64;
                    languageProgress = null;
                    break;
                case 7:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i2 |= 128;
                    languageProgress = null;
                    break;
                case 8:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i2 |= 256;
                    languageProgress = null;
                    break;
                case 9:
                    dMo4072F3 = df1VarMo4079b.mo4072F(serialDescriptor, 9);
                    i2 |= 512;
                    languageProgress = null;
                    break;
                case 10:
                    dMo4072F4 = df1VarMo4079b.mo4072F(serialDescriptor, 10);
                    i2 |= 1024;
                    languageProgress = null;
                    break;
                case 11:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 11);
                    i2 |= 2048;
                    languageProgress = null;
                    break;
                case 12:
                    iMo4091q7 = df1VarMo4079b.mo4091q(serialDescriptor, 12);
                    i2 |= 4096;
                    languageProgress = null;
                    break;
                case 13:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list);
                    i2 |= 8192;
                    languageProgress = null;
                    break;
                case 14:
                    iMo4091q8 = df1VarMo4079b.mo4091q(serialDescriptor, 14);
                    i2 |= 16384;
                    break;
                case 15:
                    iMo4091q9 = df1VarMo4079b.mo4091q(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    break;
                case 16:
                    dMo4072F5 = df1VarMo4079b.mo4072F(serialDescriptor, 16);
                    i = 65536;
                    i2 |= i;
                    break;
                case 17:
                    iMo4091q10 = df1VarMo4079b.mo4091q(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    break;
                case 18:
                    iMo4091q11 = df1VarMo4079b.mo4091q(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    break;
                case 19:
                    iMo4091q12 = df1VarMo4079b.mo4091q(serialDescriptor, 19);
                    i = 524288;
                    i2 |= i;
                    break;
                case 20:
                    iMo4091q13 = df1VarMo4079b.mo4091q(serialDescriptor, 20);
                    i = 1048576;
                    i2 |= i;
                    break;
                case 21:
                    iMo4091q14 = df1VarMo4079b.mo4091q(serialDescriptor, 21);
                    i = 2097152;
                    i2 |= i;
                    break;
                case 22:
                    iMo4091q15 = df1VarMo4079b.mo4091q(serialDescriptor, 22);
                    i = 4194304;
                    i2 |= i;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iMo4091q16 = df1VarMo4079b.mo4091q(serialDescriptor, 23);
                    i = 8388608;
                    i2 |= i;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return languageProgress;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageProgress(i2, strMo4097x, strMo4097x2, iMo4091q, dMo4072F, iMo4091q2, dMo4072F2, iMo4091q3, iMo4091q4, iMo4091q5, dMo4072F3, dMo4072F4, iMo4091q6, iMo4091q7, list, iMo4091q8, iMo4091q9, dMo4072F5, iMo4091q10, iMo4091q11, iMo4091q12, iMo4091q13, iMo4091q14, iMo4091q15, iMo4091q16);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageProgress languageProgress) {
        double d;
        List list;
        double d2;
        encoder.getClass();
        languageProgress.getClass();
        int i = languageProgress.f19070x;
        int i2 = languageProgress.f19069w;
        int i3 = languageProgress.f19068v;
        int i4 = languageProgress.f19067u;
        int i5 = languageProgress.f19066t;
        int i6 = languageProgress.f19065s;
        int i7 = languageProgress.f19064r;
        double d3 = languageProgress.f19063q;
        int i8 = languageProgress.f19062p;
        int i9 = languageProgress.f19061o;
        List list2 = languageProgress.f19060n;
        int i10 = languageProgress.f19059m;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LanguageProgress.f19046y;
        String str = languageProgress.f19047a;
        int i11 = languageProgress.f19058l;
        double d4 = languageProgress.f19057k;
        double d5 = languageProgress.f19056j;
        int i12 = languageProgress.f19055i;
        int i13 = languageProgress.f19054h;
        int i14 = languageProgress.f19053g;
        double d6 = languageProgress.f19052f;
        int i15 = languageProgress.f19051e;
        double d7 = languageProgress.f19050d;
        int i16 = languageProgress.f19049c;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, languageProgress.f19048b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i16 != 0) {
            mk9VarMo15606b.m16878v(2, i16, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d7, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 3, d7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i15 != 0) {
            mk9VarMo15606b.m16878v(4, i15, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d6, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 5, d6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i14 != 0) {
            mk9VarMo15606b.m16878v(6, i14, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i13 != 0) {
            mk9VarMo15606b.m16878v(7, i13, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i12 != 0) {
            mk9VarMo15606b.m16878v(8, i12, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d5, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 9, d5);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            d = d4;
            if (Double.compare(d, 0.0d) != 0) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i11 != 0) {
                mk9VarMo15606b.m16878v(11, i11, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i10 != 0) {
                mk9VarMo15606b.m16878v(12, i10, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list = list2;
                if (!fa4.m11650l(list, EmptyList.f47638a)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor) || i9 != 0) {
                    mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor) || i8 != 0) {
                    mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    d2 = d3;
                    if (Double.compare(d2, 0.0d) != 0) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i7 != 0) {
                        mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i6 != 0) {
                        mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
                        mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
                        mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
                        mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
                        mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
                        mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                d2 = d3;
                mk9VarMo15606b.m16874r(serialDescriptor, 16, d2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list = list2;
            mk9VarMo15606b.m16881y(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                d2 = d3;
                if (Double.compare(d2, 0.0d) != 0) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            d2 = d3;
            mk9VarMo15606b.m16874r(serialDescriptor, 16, d2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        d = d4;
        mk9VarMo15606b.m16874r(serialDescriptor, 10, d);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(11, i11, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(11, i11, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(12, i10, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(12, i10, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list2;
            if (!fa4.m11650l(list, EmptyList.f47638a)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                d2 = d3;
                if (Double.compare(d2, 0.0d) != 0) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(23, i, serialDescriptor);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            d2 = d3;
            mk9VarMo15606b.m16874r(serialDescriptor, 16, d2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list2;
        mk9VarMo15606b.m16881y(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(14, i9, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(15, i8, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            d2 = d3;
            if (Double.compare(d2, 0.0d) != 0) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(23, i, serialDescriptor);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        d2 = d3;
        mk9VarMo15606b.m16874r(serialDescriptor, 16, d2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(17, i7, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(18, i6, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(19, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(20, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(21, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(22, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(23, i, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(23, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
