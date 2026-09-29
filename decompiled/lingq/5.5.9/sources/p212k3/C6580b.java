package p212k3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.C0800b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.C0871u;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import p129g3.InterfaceC5691h;
import p189j3.C6406b;
import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: renamed from: k3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6580b implements InterfaceC5691h<AbstractC6579a> {

    /* JADX INFO: renamed from: a */
    public static final C6580b f37404a = new C6580b();

    /* JADX INFO: renamed from: k3.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37405a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            f37405a = iArr;
        }
    }

    @Override // p129g3.InterfaceC5691h
    /* JADX INFO: renamed from: a */
    public final MutablePreferences mo12053a() {
        return new MutablePreferences(true, 1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p129g3.InterfaceC5691h
    /* JADX INFO: renamed from: b */
    public final MutablePreferences mo12054b(FileInputStream fileInputStream) throws IOException {
        try {
            C6406b c6406bM13033t = C6406b.m13033t(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(false, 1);
            AbstractC6579a.b[] bVarArr = (AbstractC6579a.b[]) Arrays.copyOf(new AbstractC6579a.b[0], 0);
            C5207g.m11111f(bVarArr, "pairs");
            mutablePreferences.m3051c();
            if (bVarArr.length > 0) {
                bVarArr[0].getClass();
                mutablePreferences.m3053e(null, null);
                throw null;
            }
            Map<String, PreferencesProto$Value> mapM13034r = c6406bM13033t.m13034r();
            C5207g.m11110e(mapM13034r, "preferencesProto.preferencesMap");
            for (Map.Entry<String, PreferencesProto$Value> entry : mapM13034r.entrySet()) {
                String key = entry.getKey();
                PreferencesProto$Value value = entry.getValue();
                C5207g.m11110e(key, "name");
                C5207g.m11110e(value, "value");
                PreferencesProto$Value.ValueCase valueCaseM3037F = value.m3037F();
                switch (valueCaseM3037F == null ? -1 : a.f37405a[valueCaseM3037F.ordinal()]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new CorruptionException("Value case is null.");
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        mutablePreferences.m3053e(C7499b.m14938f(key), Boolean.valueOf(value.m3039x()));
                        break;
                    case 2:
                        mutablePreferences.m3053e(new AbstractC6579a.a<>(key), Float.valueOf(value.m3032A()));
                        break;
                    case 3:
                        mutablePreferences.m3053e(new AbstractC6579a.a<>(key), Double.valueOf(value.m3040z()));
                        break;
                    case 4:
                        mutablePreferences.m3053e(C7499b.m14922T(key), Integer.valueOf(value.m3033B()));
                        break;
                    case 5:
                        mutablePreferences.m3053e(new AbstractC6579a.a<>(key), Long.valueOf(value.m3034C()));
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        AbstractC6579a.a<?> aVarM14975y0 = C7499b.m14975y0(key);
                        String strM3035D = value.m3035D();
                        C5207g.m11110e(strM3035D, "value.string");
                        mutablePreferences.m3053e(aVarM14975y0, strM3035D);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        AbstractC6579a.a<?> aVar = new AbstractC6579a.a<>(key);
                        C0871u.c cVarM3048s = value.m3036E().m3048s();
                        C5207g.m11110e(cVarM3048s, "value.stringSet.stringsList");
                        mutablePreferences.m3053e(aVar, C6752c.m13457y0(cVarM3048s));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return new MutablePreferences((Map<AbstractC6579a.a<?>, Object>) C6753d.m13467T0(mutablePreferences.mo3049a()), true);
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException(e10);
        }
    }

    @Override // p129g3.InterfaceC5691h
    /* JADX INFO: renamed from: c */
    public final C9072e mo12055c(Object obj, SingleProcessDataStore.C0791b c0791b) throws IOException {
        PreferencesProto$Value preferencesProto$ValueM3136i;
        Map<AbstractC6579a.a<?>, Object> mapMo3049a = ((AbstractC6579a) obj).mo3049a();
        C6406b.a aVarM13032s = C6406b.m13032s();
        for (Map.Entry<AbstractC6579a.a<?>, Object> entry : mapMo3049a.entrySet()) {
            AbstractC6579a.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f37403a;
            if (value instanceof Boolean) {
                PreferencesProto$Value.C0798a c0798aM3022G = PreferencesProto$Value.m3022G();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c0798aM3022G.m3138k();
                PreferencesProto$Value.m3028u((PreferencesProto$Value) c0798aM3022G.f5811b, zBooleanValue);
                preferencesProto$ValueM3136i = c0798aM3022G.m3136i();
            } else if (value instanceof Float) {
                PreferencesProto$Value.C0798a c0798aM3022G2 = PreferencesProto$Value.m3022G();
                float fFloatValue = ((Number) value).floatValue();
                c0798aM3022G2.m3138k();
                PreferencesProto$Value.m3029v((PreferencesProto$Value) c0798aM3022G2.f5811b, fFloatValue);
                preferencesProto$ValueM3136i = c0798aM3022G2.m3136i();
            } else if (value instanceof Double) {
                PreferencesProto$Value.C0798a c0798aM3022G3 = PreferencesProto$Value.m3022G();
                double dDoubleValue = ((Number) value).doubleValue();
                c0798aM3022G3.m3138k();
                PreferencesProto$Value.m3026s((PreferencesProto$Value) c0798aM3022G3.f5811b, dDoubleValue);
                preferencesProto$ValueM3136i = c0798aM3022G3.m3136i();
            } else if (value instanceof Integer) {
                PreferencesProto$Value.C0798a c0798aM3022G4 = PreferencesProto$Value.m3022G();
                int iIntValue = ((Number) value).intValue();
                c0798aM3022G4.m3138k();
                PreferencesProto$Value.m3030w((PreferencesProto$Value) c0798aM3022G4.f5811b, iIntValue);
                preferencesProto$ValueM3136i = c0798aM3022G4.m3136i();
            } else if (value instanceof Long) {
                PreferencesProto$Value.C0798a c0798aM3022G5 = PreferencesProto$Value.m3022G();
                long jLongValue = ((Number) value).longValue();
                c0798aM3022G5.m3138k();
                PreferencesProto$Value.m3023p((PreferencesProto$Value) c0798aM3022G5.f5811b, jLongValue);
                preferencesProto$ValueM3136i = c0798aM3022G5.m3136i();
            } else if (value instanceof String) {
                PreferencesProto$Value.C0798a c0798aM3022G6 = PreferencesProto$Value.m3022G();
                c0798aM3022G6.m3138k();
                PreferencesProto$Value.m3024q((PreferencesProto$Value) c0798aM3022G6.f5811b, (String) value);
                preferencesProto$ValueM3136i = c0798aM3022G6.m3136i();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(C5207g.m11116k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                PreferencesProto$Value.C0798a c0798aM3022G7 = PreferencesProto$Value.m3022G();
                C0800b.a aVarM3047t = C0800b.m3047t();
                aVarM3047t.m3138k();
                C0800b.m3045q((C0800b) aVarM3047t.f5811b, (Set) value);
                c0798aM3022G7.m3138k();
                PreferencesProto$Value.m3025r((PreferencesProto$Value) c0798aM3022G7.f5811b, aVarM3047t);
                preferencesProto$ValueM3136i = c0798aM3022G7.m3136i();
            }
            aVarM13032s.getClass();
            str.getClass();
            aVarM13032s.m3138k();
            C6406b.m13031q((C6406b) aVarM13032s.f5811b).put(str, preferencesProto$ValueM3136i);
        }
        C6406b c6406bM3136i = aVarM13032s.m3136i();
        int iMo3130d = c6406bM3136i.mo3130d();
        Logger logger = CodedOutputStream.f5797b;
        if (iMo3130d > 4096) {
            iMo3130d = 4096;
        }
        CodedOutputStream.C0809c c0809c = new CodedOutputStream.C0809c(c0791b, iMo3130d);
        c6406bM3136i.mo3133h(c0809c);
        if (c0809c.f5802f > 0) {
            c0809c.m3119a0();
        }
        return C9072e.f47360a;
    }
}
