package dm;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.C0141b;
import android.util.Log;
import androidx.cardview.widget.CardView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.room.RoomDatabase;
import cc.C1985y2;
import cc.InterfaceC1967w2;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.bumptech.glide.manager.InterfaceC2151g;
import com.bumptech.glide.manager.InterfaceC2152h;
import com.bumptech.glide.manager.InterfaceC2153i;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.facebook.GraphRequest;
import com.google.android.gms.internal.measurement.C2592a9;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.shared.uimodel.CardStatus;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Extras;
import fo.C5602h;
import gd.C5775n;
import hn.C6084d;
import in.AbstractC6364h;
import in.C6365i;
import in.C6373q;
import in.InterfaceC6372p;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import jm.C6526i;
import jo.C6531c;
import kh.C6689p;
import km.InterfaceC6719b;
import km.InterfaceC6720c;
import km.InterfaceC6728k;
import km.InterfaceC6729l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C6856b;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.ThreadContextKt;
import mm.InterfaceC7639b;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mn.C7650g;
import mo.C7653a;
import mo.C7661i;
import nf.C7771b;
import no.C7814a0;
import om.C8090g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p102eo.C5437b;
import p102eo.InterfaceC5436a;
import p139go.InterfaceC5847a;
import p139go.InterfaceC5848b;
import p139go.InterfaceC5849c;
import p139go.InterfaceC5850d;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5854h;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p139go.InterfaceC5861o;
import p242lf.C7356a;
import p242lf.InterfaceC7358c;
import p253m1.C7457d;
import p291o7.C8004n;
import p309p.C8158b;
import p309p.C8159c;
import p309p.InterfaceC8157a;
import p326q.C8453i;
import p326q.C8454j;
import p338qd.C8573r0;
import p347qm.C8646c;
import p348qn.C8651a;
import p349qo.C8656b;
import p349qo.C8665k;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p385sf.C9000b;
import p388t1.C9180f;
import p392t5.C9203i;
import p420um.C9593z;
import p421un.C9595b;
import p436vf.C9718b;
import p464wl.InterfaceC9968c;
import p482xd.InterfaceC10173e;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5237j;
import p543do.C5238j0;
import p543do.C5247o;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import pf.C8239b;
import pf.C8241d;
import pf.C8242e;
import pf.C8243f;
import pf.C8244g;
import pf.C8245h;
import pf.InterfaceC8240c;
import pn.C8413d;
import pn.C8414e;
import sm.C9079g;
import sm.InterfaceC9077e;
import so.C9083a0;
import so.C9106x;
import so.InterfaceC9084b;
import tl.C9325m;
import zm.C10534s;

/* JADX INFO: renamed from: dm.f */
/* JADX INFO: loaded from: classes2.dex */
public class C5206f implements InterfaceC1967w2, InterfaceC5436a, InterfaceC2152h, InterfaceC2151g, InterfaceC7358c, InterfaceC9084b {

    /* JADX INFO: renamed from: b */
    public static Thread f33267b;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C5206f f33266a = new C5206f();

    /* JADX INFO: renamed from: c */
    public static final C5206f f33268c = new C5206f();

    /* JADX INFO: renamed from: d */
    public static final char[] f33269d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: e */
    public static final C5206f f33270e = new C5206f();

    /* JADX INFO: renamed from: f */
    public static final C7168r f33271f = new C7168r("REMOVE_PREPARED");

    /* JADX INFO: renamed from: g */
    public static final C7168r f33272g = new C7168r("NULL");

    /* JADX INFO: renamed from: h */
    public static final C7168r f33273h = new C7168r("UNINITIALIZED");

    /* JADX INFO: renamed from: i */
    public static final C7168r f33274i = new C7168r("DONE");

    /* JADX INFO: renamed from: j */
    public static final C9180f f33275j = new C9180f(false);

    public /* synthetic */ C5206f() {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C5206f(Locale locale, CharSequence charSequence) {
        int length = charSequence.length();
        boolean z10 = true;
        if (!(charSequence.length() >= 0)) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (length < 0 || length > charSequence.length()) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        C5207g.m11110e(wordInstance, "getWordInstance(locale)");
        Math.max(0, -50);
        Math.min(charSequence.length(), length + 50);
        wordInstance.setText(new C7457d(charSequence, length));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A0 */
    public static final String m10979A0(InterfaceC8830c interfaceC8830c, InterfaceC6372p interfaceC6372p) {
        C5207g.m11111f(interfaceC8830c, "klass");
        C5207g.m11111f(interfaceC6372p, "typeMappingConfiguration");
        interfaceC6372p.mo11190b(interfaceC8830c);
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8830c.mo11876g();
        C5207g.m11110e(interfaceC8838gMo11876g, "klass.containingDeclaration");
        C7648e c7648eMo11874a = interfaceC8830c.mo11874a();
        if (c7648eMo11874a != null) {
            C7648e c7648e = C7650g.f42089a;
            if (c7648eMo11874a.f42087b) {
                c7648eMo11874a = C7650g.f42091c;
            }
        } else {
            c7648eMo11874a = C7650g.f42091c;
        }
        String strM15236g = c7648eMo11874a.m15236g();
        C5207g.m11110e(strM15236g, "safeIdentifier(klass.name).identifier");
        if (interfaceC8838gMo11876g instanceof InterfaceC8865w) {
            C7646c c7646cMo17120e = ((InterfaceC8865w) interfaceC8838gMo11876g).mo17120e();
            if (c7646cMo17120e.m15216d()) {
                return strM15236g;
            }
            return C7661i.m15253S2(c7646cMo17120e.m15214b(), '.', '/') + '/' + strM15236g;
        }
        InterfaceC8830c interfaceC8830c2 = interfaceC8838gMo11876g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g : null;
        if (interfaceC8830c2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC8838gMo11876g + " for " + interfaceC8830c);
        }
        interfaceC6372p.mo11192h(interfaceC8830c2);
        return m10979A0(interfaceC8830c2, interfaceC6372p) + '$' + strM15236g;
    }

    /* JADX INFO: renamed from: A1 */
    public static final void m10980A1(String str, String str2) {
        File fileM10997S0 = m10997S0();
        if (fileM10997S0 != null && str != null) {
            if (str2 == null) {
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM10997S0, str));
                byte[] bytes = str2.getBytes(C7653a.f42116b);
                C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final Collection m10981B0(Collection collection, Collection collection2) {
        C5207g.m11111f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public static final ArrayList m10982C0(ArrayList arrayList, List list, InterfaceC6816a interfaceC6816a) {
        C5207g.m11111f(list, "oldValueParameters");
        C5207g.m11111f(interfaceC6816a, "newOwner");
        arrayList.size();
        list.size();
        ArrayList<Pair> arrayListM13412A0 = C6752c.m13412A0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13412A0, 10));
        for (Pair pair : arrayListM13412A0) {
            AbstractC5257t abstractC5257t = (AbstractC5257t) pair.f38012a;
            InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) pair.f38013b;
            int index = interfaceC8853n0.getIndex();
            InterfaceC9077e interfaceC9077eMo11289w = interfaceC8853n0.mo11289w();
            C7648e c7648eMo11874a = interfaceC8853n0.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "oldParameter.name");
            boolean zMo13643B0 = interfaceC8853n0.mo13643B0();
            boolean zMo13645i0 = interfaceC8853n0.mo13645i0();
            boolean zMo13644f0 = interfaceC8853n0.mo13644f0();
            AbstractC5257t abstractC5257tM13550g = interfaceC8853n0.mo13647r0() != null ? DescriptorUtilsKt.m14113j(interfaceC6816a).mo11877o().m13550g(abstractC5257t) : null;
            InterfaceC8837f0 interfaceC8837f0Mo11890j = interfaceC8853n0.mo11890j();
            C5207g.m11110e(interfaceC8837f0Mo11890j, "oldParameter.source");
            arrayList2.add(new C6830d(interfaceC6816a, null, index, interfaceC9077eMo11289w, c7648eMo11874a, abstractC5257t, zMo13643B0, zMo13645i0, zMo13644f0, abstractC5257tM13550g, interfaceC8837f0Mo11890j));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: D0 */
    public static final RoomDatabase.C1180a m10983D0(Context context, Class cls, String str) {
        C5207g.m11111f(context, "context");
        if (true ^ (str == null || C7661i.m15250P2(str))) {
            return new RoomDatabase.C1180a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m10984E0(String str) {
        File fileM10997S0 = m10997S0();
        if (fileM10997S0 != null) {
            if (str == null) {
            } else {
                new File(fileM10997S0, str).delete();
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final boolean m10985F0(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: G0 */
    public static String m10986G0(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            byte bMo3060a = byteString.mo3060a(i10);
            if (bMo3060a == 34) {
                sb2.append("\\\"");
            } else if (bMo3060a == 39) {
                sb2.append("\\'");
            } else if (bMo3060a != 92) {
                switch (bMo3060a) {
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo3060a < 32 || bMo3060a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo3060a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo3060a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo3060a & 7) + 48));
                        } else {
                            sb2.append((char) bMo3060a);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: H0 */
    public static EnqueueAction m10987H0(int i10) {
        EnqueueAction.INSTANCE.getClass();
        return EnqueueAction.Companion.m10593a(i10);
    }

    /* JADX INFO: renamed from: I0 */
    public static Error m10988I0(int i10) {
        Error.INSTANCE.getClass();
        return Error.Companion.m10594a(i10);
    }

    /* JADX INFO: renamed from: J0 */
    public static Extras m10989J0(String str) throws JSONException {
        C5207g.m11112g(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        C5207g.m11107b(itKeys, "json.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            C5207g.m11107b(next, "it");
            String string = jSONObject.getString(next);
            C5207g.m11107b(string, "json.getString(it)");
            linkedHashMap.put(next, string);
        }
        return new Extras(linkedHashMap);
    }

    /* JADX INFO: renamed from: K0 */
    public static String m10990K0(Extras extras) throws JSONException {
        C5207g.m11112g(extras, "extras");
        Map<String, String> map = extras.f32541a;
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : C6753d.m13465R0(map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        C5207g.m11107b(string, "json.toString()");
        return string;
    }

    /* JADX INFO: renamed from: L0 */
    public static LinkedHashMap m10991L0(String str) throws JSONException {
        C5207g.m11112g(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        C5207g.m11107b(itKeys, "json.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            C5207g.m11107b(next, "it");
            String string = jSONObject.getString(next);
            C5207g.m11107b(string, "json.getString(it)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: M0 */
    public static NetworkType m10992M0(int i10) {
        NetworkType.INSTANCE.getClass();
        return NetworkType.Companion.m10595a(i10);
    }

    /* JADX INFO: renamed from: N0 */
    public static Priority m10993N0(int i10) {
        Priority.INSTANCE.getClass();
        return Priority.Companion.m10596a(i10);
    }

    /* JADX INFO: renamed from: O0 */
    public static Status m10994O0(int i10) {
        Status.INSTANCE.getClass();
        return Status.Companion.m10597a(i10);
    }

    /* JADX INFO: renamed from: P0 */
    public static final InterfaceC6719b m10995P0(Annotation annotation) {
        C5207g.m11111f(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        C5207g.m11110e(clsAnnotationType, "this as java.lang.annota…otation).annotationType()");
        InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(clsAnnotationType);
        C5207g.m11109d(interfaceC6719bM11118a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return interfaceC6719bM11118a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final int m10996Q0(InterfaceC7639b interfaceC7639b) {
        C5207g.m11111f(interfaceC7639b, "<this>");
        return interfaceC7639b.mo13522a().size();
    }

    /* JADX INFO: renamed from: S0 */
    public static final File m10997S0() {
        File file = new File(C8004n.m15871a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public static final Class m10998T0(InterfaceC6719b interfaceC6719b) {
        C5207g.m11111f(interfaceC6719b, "<this>");
        Class<?> clsMo10973b = ((InterfaceC5202b) interfaceC6719b).mo10973b();
        C5207g.m11109d(clsMo10973b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo10973b;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Class m10999U0(InterfaceC6719b interfaceC6719b) {
        C5207g.m11111f(interfaceC6719b, "<this>");
        Class<?> clsMo10973b = ((InterfaceC5202b) interfaceC6719b).mo10973b();
        if (!clsMo10973b.isPrimitive()) {
            return clsMo10973b;
        }
        String name = clsMo10973b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsMo10973b : Double.class;
            case 104431:
                return !name.equals("int") ? clsMo10973b : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsMo10973b : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsMo10973b : Character.class;
            case 3327612:
                return !name.equals("long") ? clsMo10973b : Long.class;
            case 3625364:
                return !name.equals("void") ? clsMo10973b : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsMo10973b : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsMo10973b : Float.class;
            case 109413500:
                return !name.equals("short") ? clsMo10973b : Short.class;
            default:
                return clsMo10973b;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V0 */
    public static final Class m11000V0(InterfaceC6719b interfaceC6719b) {
        C5207g.m11111f(interfaceC6719b, "<this>");
        Class<?> clsMo10973b = ((InterfaceC5202b) interfaceC6719b).mo10973b();
        if (clsMo10973b.isPrimitive()) {
            return clsMo10973b;
        }
        String name = clsMo10973b.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6, types: [rm.c] */
    /* JADX INFO: renamed from: W0 */
    public static final InterfaceC6719b m11001W0(InterfaceC6720c interfaceC6720c) {
        Object obj;
        InterfaceC6719b interfaceC6719bM11001W0;
        ?? r10;
        if (interfaceC6720c instanceof InterfaceC6719b) {
            return (InterfaceC6719b) interfaceC6720c;
        }
        if (!(interfaceC6720c instanceof InterfaceC6729l)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC6720c);
        }
        List<InterfaceC6728k> upperBounds = ((InterfaceC6729l) interfaceC6720c).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC6728k interfaceC6728k = (InterfaceC6728k) next;
            C5207g.m11109d(interfaceC6728k, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC8834e interfaceC8834eMo11235q = ((KTypeImpl) interfaceC6728k).f38272a.mo11250X0().mo11235q();
            if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
                r10 = obj;
                r10 = (InterfaceC8830c) interfaceC8834eMo11235q;
            }
            if ((r10 == 0 || r10.mo13602u() == ClassKind.INTERFACE || r10.mo13602u() == ClassKind.ANNOTATION_CLASS) ? false : true) {
                obj = next;
                break;
            }
        }
        InterfaceC6728k interfaceC6728k2 = (InterfaceC6728k) obj;
        if (interfaceC6728k2 == null) {
            interfaceC6728k2 = (InterfaceC6728k) C6752c.m13425S(upperBounds);
        }
        if (interfaceC6728k2 == null) {
            return C5209i.m11118a(Object.class);
        }
        InterfaceC6720c interfaceC6720cMo13340g = interfaceC6728k2.mo13340g();
        if (interfaceC6720cMo13340g != null && (interfaceC6719bM11001W0 = m11001W0(interfaceC6720cMo13340g)) != null) {
            return interfaceC6719bM11001W0;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC6728k2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X0 */
    public static Object m11002X0(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final C6856b m11003Y0(InterfaceC8830c interfaceC8830c) {
        InterfaceC8830c interfaceC8830c2;
        C5207g.m11111f(interfaceC8830c, "<this>");
        int i10 = DescriptorUtilsKt.f39656a;
        Iterator<AbstractC5257t> it = interfaceC8830c.mo5316v().mo11250X0().mo11278p().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC8830c2 = null;
                break;
            }
            AbstractC5257t next = it.next();
            if (!AbstractC6795c.m13545y(next)) {
                InterfaceC8834e interfaceC8834eMo11235q = next.mo11250X0().mo11235q();
                int i11 = C8413d.f45539a;
                if (C8413d.m16455n(interfaceC8834eMo11235q, ClassKind.CLASS) || C8413d.m16455n(interfaceC8834eMo11235q, ClassKind.ENUM_CLASS)) {
                    C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC8830c2 = (InterfaceC8830c) interfaceC8834eMo11235q;
                    break;
                }
            }
        }
        if (interfaceC8830c2 == null) {
            return null;
        }
        MemberScope memberScopeMo13598Z = interfaceC8830c2.mo13598Z();
        C6856b c6856b = memberScopeMo13598Z instanceof C6856b ? (C6856b) memberScopeMo13598Z : null;
        return c6856b == null ? m11003Y0(interfaceC8830c2) : c6856b;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m11004Z0(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a1 */
    public static final InterfaceC8834e m11005a1(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8838g.mo11876g();
        if (interfaceC8838gMo11876g != null && !(interfaceC8838g instanceof InterfaceC8865w)) {
            if (!(interfaceC8838gMo11876g.mo11876g() instanceof InterfaceC8865w)) {
                return m11005a1(interfaceC8838gMo11876g);
            }
            if (interfaceC8838gMo11876g instanceof InterfaceC8834e) {
                return (InterfaceC8834e) interfaceC8838gMo11876g;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b1 */
    public static final boolean m11006b1(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        C5207g.m11110e(className, "element.className");
        if (!C7661i.m15256V2(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            C5207g.m11110e(className2, "element.className");
            if (!C7661i.m15256V2(className2, "com.meta", false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e1 */
    public static final boolean m11007e1(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C5207g.m11110e(stackTraceElement, "element");
                if (m11006b1(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    C5207g.m11110e(className, "element.className");
                    if (!C7661i.m15256V2(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        C5207g.m11110e(className2, "element.className");
                        if (C7661i.m15256V2(className2, "com.facebook.appevents.suggestedevents", false)) {
                        }
                        return true;
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C5207g.m11110e(methodName, "element.methodName");
                    if (C7661i.m15256V2(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        C5207g.m11110e(methodName2, "element.methodName");
                        if (C7661i.m15256V2(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            C5207g.m11110e(methodName3, "element.methodName");
                            if (!C7661i.m15256V2(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f1 */
    public static final boolean m11008f1(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public static final C6531c m11009g1(ArrayList arrayList) {
        C6531c c6531c = new C6531c();
        while (true) {
            for (Object obj : arrayList) {
                MemberScope memberScope = (MemberScope) obj;
                if ((memberScope == null || memberScope == MemberScope.C7015a.f39670b) ? false : true) {
                    c6531c.add(obj);
                }
            }
            return c6531c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x0170  */
    /* JADX INFO: renamed from: i1 */
    public static final Object m11010i1(AbstractC5257t abstractC5257t, C6373q c6373q, InterfaceC2057q interfaceC2057q) {
        AbstractC6364h bVar;
        AbstractC6364h.b bVarM12993b;
        AbstractC5257t abstractC5257t2;
        C6373q c6373q2;
        Object objM11010i1;
        int i10;
        JvmPrimitiveType jvmPrimitiveType;
        boolean z10;
        AbstractC6364h.c cVarM12994c;
        boolean z11;
        JvmPrimitiveType jvmPrimitiveType2;
        C6365i c6365i = C6365i.f36754a;
        C5212l c5212l = C5212l.f33290i;
        C5207g.m11111f(abstractC5257t, "kotlinType");
        C5207g.m11111f(interfaceC2057q, "writeGenericType");
        if (C0062b.m422z1(abstractC5257t)) {
            C9593z c9593z = C8090g.f43908a;
            C0062b.m422z1(abstractC5257t);
            AbstractC6795c abstractC6795cM14230g = TypeUtilsKt.m14230g(abstractC5257t);
            InterfaceC9077e interfaceC9077eMo11289w = abstractC5257t.mo11289w();
            AbstractC5257t abstractC5257tM362k1 = C0062b.m362k1(abstractC5257t);
            List listM343e1 = C0062b.m343e1(abstractC5257t);
            List listM370m1 = C0062b.m370m1(abstractC5257t);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listM370m1, 10));
            Iterator it = listM370m1.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5246n0) it.next()).mo11236c());
            }
            C5238j0.f33329b.getClass();
            C5238j0 c5238j0 = C5238j0.f33330c;
            InterfaceC5240k0 interfaceC5240k0Mo13600k = C8090g.f43908a.mo13600k();
            C0062b.m398t1(abstractC5257t);
            AbstractC5257t abstractC5257tMo11236c = ((InterfaceC5246n0) C6752c.m13432Z(abstractC5257t.mo11240V0())).mo11236c();
            C5207g.m11110e(abstractC5257tMo11236c, "arguments.last().type");
            return m11010i1(C0062b.m261E0(abstractC6795cM14230g, interfaceC9077eMo11289w, abstractC5257tM362k1, listM343e1, C6752c.m13439g0(KotlinTypeFactory.m14187f(c5238j0, interfaceC5240k0Mo13600k, C9000b.m17251q(TypeUtilsKt.m14224a(abstractC5257tMo11236c)), false, null), arrayList), TypeUtilsKt.m14230g(abstractC5257t).m13559p(), false).mo11217b1(abstractC5257t.mo11242Y0()), c6373q, interfaceC2057q);
        }
        InterfaceC5856j interfaceC5856jM11636l0 = InterfaceC5436a.a.m11636l0(f33268c, abstractC5257t);
        if (InterfaceC5436a.a.m11595I(interfaceC5856jM11636l0)) {
            PrimitiveType primitiveTypeM11650u = InterfaceC5436a.a.m11650u(interfaceC5856jM11636l0);
            if (primitiveTypeM11650u != null) {
                cVarM12994c = c6365i.m12994c(primitiveTypeM11650u);
                if (InterfaceC5436a.a.m11605S(abstractC5257t)) {
                    z11 = true;
                } else {
                    C7646c c7646c = C10534s.f52549p;
                    C5207g.m11110e(c7646c, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (InterfaceC5436a.a.m11590D(abstractC5257t, c7646c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                C5207g.m11111f(cVarM12994c, "possiblyPrimitiveType");
                bVar = cVarM12994c;
                if (z11 && (jvmPrimitiveType2 = cVarM12994c.f36753i) != null) {
                    bVar = cVarM12994c;
                    String strM18067e = C9595b.m18065c(jvmPrimitiveType2.getWrapperFqName()).m18067e();
                    C5207g.m11110e(strM18067e, "byFqNameWithoutInnerClas…apperFqName).internalName");
                    bVar = new AbstractC6364h.b(strM18067e);
                }
            } else {
                PrimitiveType primitiveTypeM11649t = InterfaceC5436a.a.m11649t(interfaceC5856jM11636l0);
                if (primitiveTypeM11649t != null) {
                    bVar = C6365i.m12991a("[" + JvmPrimitiveType.get(primitiveTypeM11649t).getDesc());
                } else if (InterfaceC5436a.a.m11611Y(interfaceC5856jM11636l0)) {
                    C7647d c7647dM11645q = InterfaceC5436a.a.m11645q(interfaceC5856jM11636l0);
                    String str = C8646c.f46201a;
                    C7645b c7645bM16869g = C8646c.m16869g(c7647dM11645q);
                    if (c7645bM16869g == null) {
                        bVar = null;
                    } else {
                        if (!c6373q.f36768g) {
                            List<C8646c.a> list = C8646c.f46214n;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    if (C5207g.m11106a(((C8646c.a) it2.next()).f46215a, c7645bM16869g)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                            if (z10) {
                                bVar = null;
                            }
                        }
                        String strM18067e2 = C9595b.m18064b(c7645bM16869g).m18067e();
                        C5207g.m11110e(strM18067e2, "byClassId(classId).internalName");
                        bVar = c6365i.m12993b(strM18067e2);
                    }
                } else {
                    bVar = null;
                }
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            AbstractC6364h bVar2 = bVar;
            if (c6373q.f36762a && (bVar instanceof AbstractC6364h.c) && (jvmPrimitiveType = ((AbstractC6364h.c) bVar).f36753i) != null) {
                bVar2 = bVar;
                bVar2 = bVar;
                String strM18067e3 = C9595b.m18065c(jvmPrimitiveType.getWrapperFqName()).m18067e();
                C5207g.m11110e(strM18067e3, "byFqNameWithoutInnerClas…apperFqName).internalName");
                bVar2 = new AbstractC6364h.b(strM18067e3);
            }
            bVar2 = bVar;
            bVar2 = bVar;
            bVar2 = bVar;
            interfaceC2057q.mo1343M(abstractC5257t, bVar2, c6373q);
            return bVar2;
        }
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
        if (interfaceC5240k0Mo11250X0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) interfaceC5240k0Mo11250X0;
            AbstractC5257t abstractC5257t3 = intersectionTypeConstructor.f39863a;
            if (abstractC5257t3 != null) {
                return m11010i1(TypeUtilsKt.m14238o(abstractC5257t3), c6373q, interfaceC2057q);
            }
            c5212l.m11187D(intersectionTypeConstructor.f39864b);
            throw null;
        }
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0Mo11250X0.mo11235q();
        if (interfaceC8834eMo11235q == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC5257t);
        }
        if (C5602h.m11915f(interfaceC8834eMo11235q)) {
            return c6365i.m12993b("error/NonExistentClass");
        }
        boolean z12 = interfaceC8834eMo11235q instanceof InterfaceC8830c;
        boolean z13 = c6373q.f36764c;
        if (z12 && AbstractC6795c.m13546z(abstractC5257t)) {
            if (abstractC5257t.mo11240V0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC5246n0 interfaceC5246n0 = abstractC5257t.mo11240V0().get(0);
            AbstractC5257t abstractC5257tMo11236c2 = interfaceC5246n0.mo11236c();
            C5207g.m11110e(abstractC5257tMo11236c2, "memberProjection.type");
            if (interfaceC5246n0.mo11237d() == Variance.IN_VARIANCE) {
                objM11010i1 = c6365i.m12993b("java/lang/Object");
            } else {
                Variance varianceMo11237d = interfaceC5246n0.mo11237d();
                C5207g.m11110e(varianceMo11237d, "memberProjection.projectionKind");
                if (z13 || ((i10 = C6373q.a.f36772a[varianceMo11237d.ordinal()]) == 1 ? (c6373q2 = c6373q.f36769h) == null : !(i10 == 2 ? (c6373q2 = c6373q.f36770i) != null : (c6373q2 = c6373q.f36767f) != null))) {
                    c6373q2 = c6373q;
                }
                objM11010i1 = m11010i1(abstractC5257tMo11236c2, c6373q2, interfaceC2057q);
            }
            return C6365i.m12991a("[" + c6365i.m12996f(objM11010i1));
        }
        if (!z12) {
            if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                AbstractC5257t abstractC5257tM14231h = TypeUtilsKt.m14231h((InterfaceC8847k0) interfaceC8834eMo11235q);
                if (abstractC5257t.mo11242Y0()) {
                    abstractC5257tM14231h = TypeUtilsKt.m14235l(abstractC5257tM14231h);
                }
                return m11010i1(abstractC5257tM14231h, c6373q, FunctionsKt.f39945b);
            }
            if ((interfaceC8834eMo11235q instanceof InterfaceC8845j0) && c6373q.f36771j) {
                return m11010i1(((InterfaceC8845j0) interfaceC8834eMo11235q).mo5313d0(), c6373q, interfaceC2057q);
            }
            throw new UnsupportedOperationException("Unknown type " + abstractC5257t);
        }
        if (C8414e.m16465b(interfaceC8834eMo11235q) && !c6373q.f36763b && (abstractC5257t2 = (AbstractC5257t) C0062b.m417y0(abstractC5257t, new HashSet())) != null) {
            return m11010i1(abstractC5257t2, new C6373q(c6373q.f36762a, true, c6373q.f36764c, c6373q.f36765d, c6373q.f36766e, c6373q.f36767f, c6373q.f36768g, c6373q.f36769h, c6373q.f36770i, false, 512), interfaceC2057q);
        }
        if (z13 && AbstractC6795c.m13542c((InterfaceC8830c) interfaceC8834eMo11235q, C6797e.a.f38364P)) {
            bVarM12993b = c6365i.m12995d();
        } else {
            InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo11235q;
            C5207g.m11110e(interfaceC8830c.mo18004P0(), "descriptor.original");
            if (interfaceC8830c.mo13602u() == ClassKind.ENUM_ENTRY) {
                InterfaceC8838g interfaceC8838gMo11876g = interfaceC8830c.mo11876g();
                C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                interfaceC8830c = (InterfaceC8830c) interfaceC8838gMo11876g;
            }
            InterfaceC8830c interfaceC8830cMo11875b = interfaceC8830c.mo18004P0();
            C5207g.m11110e(interfaceC8830cMo11875b, "enumClassIfEnumEntry.original");
            bVarM12993b = c6365i.m12993b(m10979A0(interfaceC8830cMo11875b, c5212l));
        }
        interfaceC2057q.mo1343M(abstractC5257t, bVarM12993b, c6373q);
        return bVarM12993b;
    }

    /* JADX INFO: renamed from: j1 */
    public static double m11011j1(long j10) {
        return j10 / 1000.0d;
    }

    /* JADX INFO: renamed from: k1 */
    public static final JSONObject m11012k1(String str) {
        File fileM10997S0 = m10997S0();
        if (fileM10997S0 != null) {
            try {
                return new JSONObject(C5086z.m10812K(new FileInputStream(new File(fileM10997S0, str))));
            } catch (Exception unused) {
                m10984E0(str);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public static final AbstractC5265x m11013l1(AbstractC5265x abstractC5265x, List list, C5238j0 c5238j0) {
        C5207g.m11111f(abstractC5265x, "<this>");
        C5207g.m11111f(list, "newArguments");
        C5207g.m11111f(c5238j0, "newAttributes");
        if (list.isEmpty() && c5238j0 == abstractC5265x.mo11241W0()) {
            return abstractC5265x;
        }
        return list.isEmpty() ? abstractC5265x.mo11243d1(c5238j0) : KotlinTypeFactory.m14187f(c5238j0, abstractC5265x.mo11250X0(), list, abstractC5265x.mo11242Y0(), null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m1 */
    public static AbstractC5257t m11014m1(AbstractC5257t abstractC5257t, List list, InterfaceC9077e interfaceC9077e, int i10) {
        if ((i10 & 1) != 0) {
            list = abstractC5257t.mo11240V0();
        }
        if ((i10 & 2) != 0) {
            interfaceC9077e = abstractC5257t.mo11289w();
        }
        List list2 = (i10 & 4) != 0 ? list : null;
        C5207g.m11111f(abstractC5257t, "<this>");
        C5207g.m11111f(list, "newArguments");
        C5207g.m11111f(interfaceC9077e, "newAnnotations");
        C5207g.m11111f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == abstractC5257t.mo11240V0()) && interfaceC9077e == abstractC5257t.mo11289w()) {
            return abstractC5257t;
        }
        C5238j0 c5238j0Mo11241W0 = abstractC5257t.mo11241W0();
        if ((interfaceC9077e instanceof C9079g) && interfaceC9077e.isEmpty()) {
            interfaceC9077e = InterfaceC9077e.a.f47365a;
        }
        C5238j0 c5238j0M293N1 = C0062b.m293N1(c5238j0Mo11241W0, interfaceC9077e);
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
            return KotlinTypeFactory.m14184c(m11013l1(abstractC5249p.f33340b, list, c5238j0M293N1), m11013l1(abstractC5249p.f33341c, list2, c5238j0M293N1));
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            return m11013l1((AbstractC5265x) abstractC5262v0Mo11288a1, list, c5238j0M293N1);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ AbstractC5265x m11015n1(AbstractC5265x abstractC5265x, List list, C5238j0 c5238j0, int i10) {
        if ((i10 & 1) != 0) {
            list = abstractC5265x.mo11240V0();
        }
        if ((i10 & 2) != 0) {
            c5238j0 = abstractC5265x.mo11241W0();
        }
        return m11013l1(abstractC5265x, list, c5238j0);
    }

    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC8830c m11016o1(InterfaceC8863u interfaceC8863u, C7646c c7646c, NoLookupLocation noLookupLocation) {
        InterfaceC8834e interfaceC8834eMo5304g;
        MemberScope memberScopeMo13687H0;
        C5207g.m11111f(interfaceC8863u, "<this>");
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(noLookupLocation, "lookupLocation");
        InterfaceC8830c interfaceC8830c = null;
        if (c7646c.m15216d()) {
            return null;
        }
        C7646c c7646cM15217e = c7646c.m15217e();
        C5207g.m11110e(c7646cM15217e, "fqName.parent()");
        MemberScope memberScopeMo13628q = interfaceC8863u.mo11873R(c7646cM15217e).mo13628q();
        C7648e c7648eM15218f = c7646c.m15218f();
        C5207g.m11110e(c7648eM15218f, "fqName.shortName()");
        InterfaceC8834e interfaceC8834eMo5304g2 = memberScopeMo13628q.mo5304g(c7648eM15218f, noLookupLocation);
        InterfaceC8830c interfaceC8830c2 = interfaceC8834eMo5304g2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g2 : null;
        if (interfaceC8830c2 != null) {
            return interfaceC8830c2;
        }
        C7646c c7646cM15217e2 = c7646c.m15217e();
        C5207g.m11110e(c7646cM15217e2, "fqName.parent()");
        InterfaceC8830c interfaceC8830cM11016o1 = m11016o1(interfaceC8863u, c7646cM15217e2, noLookupLocation);
        if (interfaceC8830cM11016o1 == null || (memberScopeMo13687H0 = interfaceC8830cM11016o1.mo13687H0()) == null) {
            interfaceC8834eMo5304g = null;
        } else {
            C7648e c7648eM15218f2 = c7646c.m15218f();
            C5207g.m11110e(c7648eM15218f2, "fqName.shortName()");
            interfaceC8834eMo5304g = memberScopeMo13687H0.mo5304g(c7648eM15218f2, noLookupLocation);
        }
        if (interfaceC8834eMo5304g instanceof InterfaceC8830c) {
            interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo5304g;
        }
        return interfaceC8830c;
    }

    /* JADX INFO: renamed from: p1 */
    public static long m11017p1(double d10) {
        return Math.round(d10 * 1000.0d);
    }

    /* JADX INFO: renamed from: q0 */
    public static final int m11018q0(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    /* JADX INFO: renamed from: q1 */
    public static final void m11019q1(String str, JSONArray jSONArray, GraphRequest.InterfaceC2278b interfaceC2278b) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectM10830o = C5086z.m10830o();
            if (jSONObjectM10830o != null) {
                Iterator<String> itKeys = jSONObjectM10830o.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM10830o.get(next));
                }
            }
            String str2 = GraphRequest.f11448j;
            String str3 = String.format("%s/instruments", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
            C5207g.m11110e(str3, "java.lang.String.format(format, *args)");
            GraphRequest.C2279c.m6622h(null, str3, jSONObject, interfaceC2278b).m6607d();
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static C6689p m11020r0(int i10, ReviewType reviewType, boolean z10, boolean z11, int i11, String str, String str2, CardStatus cardStatus, int i12) {
        int i13 = (i12 & 1) != 0 ? -1 : i10;
        ReviewType reviewType2 = (i12 & 2) != 0 ? ReviewType.All : reviewType;
        boolean z12 = (i12 & 4) != 0 ? false : z10;
        boolean z13 = (i12 & 8) == 0 ? z11 : false;
        int i14 = (i12 & 16) == 0 ? i11 : -1;
        String str3 = (i12 & 32) != 0 ? "" : str;
        String str4 = (i12 & 64) != 0 ? null : str2;
        CardStatus cardStatus2 = (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? CardStatus.Known : cardStatus;
        C5207g.m11111f(reviewType2, "reviewType");
        C5207g.m11111f(str3, "reviewLanguageFromDeeplink");
        C5207g.m11111f(cardStatus2, "statusUpper");
        return new C6689p(i13, reviewType2, z12, z13, i14, str3, str4, cardStatus2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m11021s0(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static void m11022s1(List list, InterfaceC10173e interfaceC10173e, int i10, int i11) {
        int size = list.size();
        while (true) {
            while (true) {
                size--;
                if (size <= i11) {
                    break;
                } else if (interfaceC10173e.apply(list.get(size))) {
                    list.remove(size);
                }
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static double m11023t1(long j10) {
        return Math.round(m11011j1(System.currentTimeMillis() - j10) * 10000.0d) / 10000.0d;
    }

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC5265x m11024u0(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        AbstractC5265x abstractC5265x = abstractC5262v0Mo11288a1 instanceof AbstractC5265x ? (AbstractC5265x) abstractC5262v0Mo11288a1 : null;
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC5257t).toString());
    }

    /* JADX INFO: renamed from: u1 */
    public static final String m11025u1(char c10, Locale locale) {
        String strValueOf = String.valueOf(c10);
        C5207g.m11109d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c10);
            C5207g.m11109d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !C5207g.m11106a(upperCase, upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m11026v0(long j10) {
        new Long(j10);
    }

    /* JADX INFO: renamed from: v1 */
    public static String m11027v1(Map map) throws JSONException {
        C5207g.m11112g(map, "headerMap");
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        C5207g.m11107b(string, "json.toString()");
        return string;
    }

    /* JADX INFO: renamed from: w1 */
    public static final double m11028w1(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m11029x0(int i10) {
        if (new C6526i(2, 36).m13106i(i10)) {
            return;
        }
        StringBuilder sbM614j = C0141b.m614j("radix ", i10, " was not in valid range ");
        sbM614j.append(new C6526i(2, 36));
        throw new IllegalArgumentException(sbM614j.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y0 */
    public static void m11030y0(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static final C8454j m11031y1(C8453i c8453i) {
        C5207g.m11112g(c8453i, "receiver$0");
        return new C8454j(c8453i);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m11032z0(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C8656b.m16899g(th2, th3);
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static final Object m11033z1(CoroutineContext coroutineContext, Object obj, Object obj2, InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) {
        Object objM14435c = ThreadContextKt.m14435c(coroutineContext, obj2);
        try {
            C8665k c8665k = new C8665k(interfaceC9968c, coroutineContext);
            C5213m.m11200e(2, interfaceC2056p);
            Object objMo1337m0 = interfaceC2056p.mo1337m0(obj, c8665k);
            ThreadContextKt.m14433a(coroutineContext, objM14435c);
            if (objMo1337m0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                C5207g.m11111f(interfaceC9968c, "frame");
            }
            return objMo1337m0;
        } catch (Throwable th2) {
            ThreadContextKt.m14433a(coroutineContext, objM14435c);
            throw th2;
        }
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: A */
    public AbstractC5265x mo11034A(InterfaceC5849c interfaceC5849c) {
        return InterfaceC5436a.a.m11620d0(interfaceC5849c);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: B */
    public boolean mo11035B(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return interfaceC5852f instanceof C6084d;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: C */
    public AbstractC5265x mo11036C(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11629i(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: D */
    public AbstractC5249p mo11037D(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11625g(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: E */
    public TypeVariance mo11038E(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11588B(interfaceC5855i);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: F */
    public boolean mo11039F(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        return mo11094r(mo11077h(interfaceC5853g));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: G */
    public NewCapturedTypeConstructor mo11040G(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11638m0(interfaceC5848b);
    }

    @Override // p102eo.InterfaceC5436a
    /* JADX INFO: renamed from: H */
    public AbstractC5262v0 mo11041H(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
        return InterfaceC5436a.a.m11637m(this, interfaceC5853g, interfaceC5853g2);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: I */
    public boolean mo11042I(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return mo11083k(mo11071e(interfaceC5852f)) != mo11083k(mo11090n0(interfaceC5852f));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: J */
    public Set mo11043J(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11624f0(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: K */
    public AbstractC5262v0 mo11044K(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11652w(interfaceC5855i);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: L */
    public boolean mo11045L(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11601O(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: M */
    public int mo11046M(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11615b(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: N */
    public boolean mo11047N(InterfaceC5848b interfaceC5848b) {
        C5207g.m11111f(interfaceC5848b, "$receiver");
        return interfaceC5848b instanceof C8651a;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: O */
    public boolean mo11048O(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11597K(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: P */
    public AbstractC5262v0 mo11049P(ArrayList arrayList) {
        return InterfaceC5436a.a.m11593G(arrayList);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Q */
    public int mo11050Q(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11622e0(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: R */
    public AbstractC5262v0 mo11051R(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11616b0(interfaceC5848b);
    }

    /* JADX INFO: renamed from: R0 */
    public void mo11052R0(float f3, float f10, C5775n c5775n) {
        throw null;
    }

    @Override // p139go.InterfaceC5860n
    /* JADX INFO: renamed from: S */
    public boolean mo11053S(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
        return InterfaceC5436a.a.m11592F(interfaceC5853g, interfaceC5853g2);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: T */
    public boolean mo11054T(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        return mo11045L(mo11077h(interfaceC5853g));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: U */
    public boolean mo11055U(InterfaceC5857k interfaceC5857k, InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11591E(interfaceC5857k, interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: V */
    public boolean mo11056V(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11602P(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: W */
    public boolean mo11057W(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11604R(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: X */
    public InterfaceC5852f mo11058X(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11646q0(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Y */
    public InterfaceC5857k mo11059Y(InterfaceC5856j interfaceC5856j, int i10) {
        return InterfaceC5436a.a.m11647r(interfaceC5856j, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Z */
    public InterfaceC5848b mo11060Z(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11619d(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: a */
    public InterfaceC5855i mo11061a(InterfaceC5852f interfaceC5852f, int i10) {
        return InterfaceC5436a.a.m11641o(interfaceC5852f, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: a0 */
    public boolean mo11062a0(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11610X(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: b */
    public boolean mo11063b(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return mo11057W(mo11101w(interfaceC5852f)) && !m11070d1(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: b0 */
    public C5250p0 mo11064b0(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11631j(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: c */
    public boolean mo11065c(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11609W(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: c0 */
    public CaptureStatus mo11066c0(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11635l(interfaceC5848b);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m11067c1(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return (interfaceC5852f instanceof InterfaceC5853g) && mo11083k((InterfaceC5853g) interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: d */
    public AbstractC5265x mo11068d(InterfaceC5853g interfaceC5853g, boolean z10) {
        return InterfaceC5436a.a.m11644p0(interfaceC5853g, z10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: d0 */
    public AbstractC5265x mo11069d0(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11640n0(interfaceC5850d);
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m11070d1(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11605S(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: e */
    public InterfaceC5853g mo11071e(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11614a0(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: e0 */
    public boolean mo11072e0(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        AbstractC5249p abstractC5249pMo11037D = mo11037D(interfaceC5852f);
        return (abstractC5249pMo11037D != null ? m11098t0(abstractC5249pMo11037D) : null) != null;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: f */
    public InterfaceC8847k0 mo11073f(InterfaceC5861o interfaceC5861o) {
        return InterfaceC5436a.a.m11653x(interfaceC5861o);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: f0 */
    public int mo11074f0(InterfaceC5854h interfaceC5854h) {
        return InterfaceC5436a.a.m11628h0(this, interfaceC5854h);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: g */
    public C5437b mo11075g(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11630i0(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: g0 */
    public InterfaceC5855i mo11076g0(InterfaceC5854h interfaceC5854h, int i10) {
        return InterfaceC5436a.a.m11639n(this, interfaceC5854h, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: h */
    public InterfaceC5240k0 mo11077h(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11634k0(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: h0 */
    public boolean mo11078h0(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11608V(interfaceC5855i);
    }

    /* JADX INFO: renamed from: h1 */
    public InterfaceC5852f m11079h1(InterfaceC5852f interfaceC5852f) {
        AbstractC5265x abstractC5265xMo11068d;
        C5207g.m11111f(interfaceC5852f, "$receiver");
        AbstractC5265x abstractC5265xMo11036C = mo11036C(interfaceC5852f);
        return (abstractC5265xMo11036C == null || (abstractC5265xMo11068d = mo11068d(abstractC5265xMo11036C, true)) == null) ? interfaceC5852f : abstractC5265xMo11068d;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: i */
    public AbstractC5262v0 mo11080i(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11618c0(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: i0 */
    public Collection mo11081i0(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11632j0(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: j */
    public C5237j mo11082j(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11621e(interfaceC5853g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        C7771b c7771b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) enumMap.get(EncodeHintType.DATA_MATRIX_SHAPE);
        if (symbolShapeHint2 != null) {
            symbolShapeHint = symbolShapeHint2;
        }
        C7356a c7356a = (C7356a) enumMap.get(EncodeHintType.MIN_SIZE);
        if (c7356a == null) {
            c7356a = null;
        }
        C7356a c7356a2 = (C7356a) enumMap.get(EncodeHintType.MAX_SIZE);
        C7356a c7356a3 = c7356a2 != null ? c7356a2 : null;
        int i13 = 0;
        int i14 = 2;
        int i15 = 3;
        InterfaceC8240c[] interfaceC8240cArr = {new C8573r0(), new C7814a0(), new C8244g(), new C8245h(), new C9203i(11), new C9203i(10)};
        C8241d c8241d = new C8241d(str);
        c8241d.f44511b = symbolShapeHint;
        c8241d.f44512c = c7356a;
        c8241d.f44513d = c7356a3;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c8241d.m16388e((char) 236);
            c8241d.f44518i = 2;
            c8241d.f44515f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c8241d.m16388e((char) 237);
            c8241d.f44518i = 2;
            c8241d.f44515f += 7;
        }
        int i16 = 0;
        while (c8241d.m16386c()) {
            interfaceC8240cArr[i16].mo15557h(c8241d);
            int i17 = c8241d.f44516g;
            if (i17 >= 0) {
                c8241d.f44516g = -1;
                i16 = i17;
            }
        }
        int iM16384a = c8241d.m16384a();
        c8241d.m16387d(c8241d.m16384a());
        int i18 = c8241d.f44517h.f44525b;
        if (iM16384a < i18 && i16 != 0 && i16 != 5 && i16 != 4) {
            c8241d.m16388e((char) 254);
        }
        StringBuilder sb2 = c8241d.f44514e;
        if (sb2.length() < i18) {
            sb2.append((char) 129);
        }
        while (sb2.length() < i18) {
            int length = (((sb2.length() + 1) * 149) % 253) + 1 + 129;
            if (length > 254) {
                length -= 254;
            }
            sb2.append((char) length);
        }
        String string = sb2.toString();
        C8243f c8243fM16390f = C8243f.m16390f(string.length(), symbolShapeHint, c7356a, c7356a3);
        int[] iArr = C8242e.f44519a;
        int length2 = string.length();
        int i19 = c8243fM16390f.f44525b;
        if (length2 != i19) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        int i20 = c8243fM16390f.f44526c;
        StringBuilder sb3 = new StringBuilder(i19 + i20);
        sb3.append(string);
        int iMo16381c = c8243fM16390f.mo16381c();
        if (iMo16381c == 1) {
            sb3.append(C8242e.m16389a(i20, string));
        } else {
            sb3.setLength(sb3.capacity());
            int[] iArr2 = new int[iMo16381c];
            int[] iArr3 = new int[iMo16381c];
            int[] iArr4 = new int[iMo16381c];
            int i21 = 0;
            while (i21 < iMo16381c) {
                int i22 = i21 + 1;
                iArr2[i21] = c8243fM16390f.mo16380a(i22);
                iArr3[i21] = c8243fM16390f.f44531h;
                iArr4[i21] = 0;
                if (i21 > 0) {
                    iArr4[i21] = iArr4[i21 - 1] + iArr2[i21];
                }
                i21 = i22;
            }
            for (int i23 = 0; i23 < iMo16381c; i23++) {
                StringBuilder sb4 = new StringBuilder(iArr2[i23]);
                for (int i24 = i23; i24 < i19; i24 += iMo16381c) {
                    sb4.append(string.charAt(i24));
                }
                String strM16389a = C8242e.m16389a(iArr3[i23], sb4.toString());
                int i25 = i23;
                int i26 = 0;
                while (i25 < iArr3[i23] * iMo16381c) {
                    sb3.setCharAt(i19 + i25, strM16389a.charAt(i26));
                    i25 += iMo16381c;
                    i26++;
                }
            }
        }
        String string2 = sb3.toString();
        int iM16391b = c8243fM16390f.m16391b();
        int i27 = c8243fM16390f.f44527d;
        int iM16393e = c8243fM16390f.m16393e();
        int i28 = c8243fM16390f.f44528e;
        C8239b c8239b = new C8239b(string2, iM16391b * i27, iM16393e * i28);
        int i29 = 0;
        int i30 = 0;
        int i31 = 4;
        while (true) {
            i10 = c8239b.f44508c;
            i11 = c8239b.f44507b;
            if (i31 == i11 && i29 == 0) {
                int i32 = i11 - 1;
                c8239b.m16382a(i32, i13, i30, 1);
                c8239b.m16382a(i32, 1, i30, i14);
                c8239b.m16382a(i32, i14, i30, i15);
                c8239b.m16382a(i13, i10 - 2, i30, 4);
                int i33 = i10 - 1;
                c8239b.m16382a(i13, i33, i30, 5);
                c8239b.m16382a(1, i33, i30, 6);
                c8239b.m16382a(i14, i33, i30, 7);
                c8239b.m16382a(3, i33, i30, 8);
                i30++;
            }
            int i34 = i11 - 2;
            if (i31 == i34 && i29 == 0 && i10 % 4 != 0) {
                c8239b.m16382a(i11 - 3, i13, i30, 1);
                c8239b.m16382a(i34, i13, i30, i14);
                c8239b.m16382a(i11 - 1, i13, i30, 3);
                c8239b.m16382a(i13, i10 - 4, i30, 4);
                c8239b.m16382a(i13, i10 - 3, i30, 5);
                c8239b.m16382a(i13, i10 - 2, i30, 6);
                int i35 = i10 - 1;
                c8239b.m16382a(i13, i35, i30, 7);
                c8239b.m16382a(1, i35, i30, 8);
                i30++;
            }
            if (i31 == i34 && i29 == 0 && i10 % 8 == 4) {
                c8239b.m16382a(i11 - 3, i13, i30, 1);
                i12 = 2;
                c8239b.m16382a(i34, i13, i30, 2);
                c8239b.m16382a(i11 - 1, i13, i30, 3);
                c8239b.m16382a(i13, i10 - 2, i30, 4);
                int i36 = i10 - 1;
                c8239b.m16382a(i13, i36, i30, 5);
                c8239b.m16382a(1, i36, i30, 6);
                c8239b.m16382a(2, i36, i30, 7);
                c8239b.m16382a(3, i36, i30, 8);
                i30++;
            } else {
                i12 = 2;
            }
            if (i31 == i11 + 4 && i29 == i12 && i10 % 8 == 0) {
                int i37 = i11 - 1;
                c8239b.m16382a(i37, i13, i30, 1);
                int i38 = i10 - 1;
                c8239b.m16382a(i37, i38, i30, i12);
                int i39 = i10 - 3;
                c8239b.m16382a(i13, i39, i30, 3);
                int i40 = i10 - 2;
                c8239b.m16382a(i13, i40, i30, 4);
                c8239b.m16382a(i13, i38, i30, 5);
                c8239b.m16382a(1, i39, i30, 6);
                c8239b.m16382a(1, i40, i30, 7);
                c8239b.m16382a(1, i38, i30, 8);
                i30++;
            }
            do {
                bArr = c8239b.f44509d;
                if (i31 < i11 && i29 >= 0) {
                    if ((bArr[(i31 * i10) + i29] >= 0 ? 1 : i13) == 0) {
                        c8239b.m16383b(i31, i29, i30);
                        i30++;
                    }
                }
                i31 -= 2;
                i29 += 2;
                if (i31 < 0) {
                    break;
                }
            } while (i29 < i10);
            int i41 = i31 + 1;
            int i42 = i29 + 3;
            do {
                if (i41 >= 0 && i42 < i10) {
                    if ((bArr[(i41 * i10) + i42] >= 0 ? 1 : i13) == 0) {
                        c8239b.m16383b(i41, i42, i30);
                        i30++;
                    }
                }
                i41 += 2;
                i42 -= 2;
                if (i41 >= i11) {
                    break;
                }
            } while (i42 >= 0);
            i31 = i41 + 3;
            i29 = i42 + 1;
            if (i31 >= i11 && i29 >= i10) {
                break;
            }
            i14 = 2;
            i13 = i13;
            i15 = 3;
        }
        int i43 = i10 - 1;
        int i44 = i11 - 1;
        if ((bArr[(i44 * i10) + i43] >= 0 ? 1 : i13) == 0) {
            int i45 = (i44 * i10) + i43;
            byte b10 = (byte) 1;
            bArr[i45] = b10;
            bArr[((i11 - 2) * i10) + (i10 - 2)] = b10;
        }
        int iM16391b2 = c8243fM16390f.m16391b() * i27;
        int iM16393e2 = c8243fM16390f.m16393e() * i28;
        C9718b c9718b = new C9718b(c8243fM16390f.m16392d(), (c8243fM16390f.m16393e() * i28) + (c8243fM16390f.m16393e() << 1));
        int i46 = i13;
        int i47 = i46;
        while (i46 < iM16393e2) {
            int i48 = i46 % i28;
            if (i48 == 0) {
                int i49 = i13;
                int i50 = i49;
                while (i49 < c8243fM16390f.m16392d()) {
                    c9718b.m18222c(i50, i47, i49 % 2 == 0 ? 1 : i13);
                    i50++;
                    i49++;
                }
                i47++;
            }
            int i51 = i13;
            int i52 = i51;
            while (i51 < iM16391b2) {
                int i53 = i51 % i27;
                if (i53 == 0) {
                    c9718b.m18222c(i52, i47, true);
                    i52++;
                }
                c9718b.m18222c(i52, i47, bArr[(i10 * i46) + i51] == 1);
                i52++;
                if (i53 == i27 - 1) {
                    c9718b.m18222c(i52, i47, i46 % 2 == 0);
                    i52++;
                }
                i51++;
            }
            i47++;
            if (i48 == i28 - 1) {
                int i54 = 0;
                for (int i55 = 0; i55 < c8243fM16390f.m16392d(); i55++) {
                    c9718b.m18222c(i54, i47, true);
                    i54++;
                }
                i47++;
            }
            i46++;
            i13 = 0;
        }
        int i56 = c9718b.f49726b;
        int iMax = Math.max(200, i56);
        int i57 = c9718b.f49727c;
        int iMax2 = Math.max(200, i57);
        int iMin = Math.min(iMax / i56, iMax2 / i57);
        int i58 = (iMax - (i56 * iMin)) / 2;
        int i59 = (iMax2 - (i57 * iMin)) / 2;
        if (200 < i57 || 200 < i56) {
            c7771b = new C7771b(i56, i57);
            i58 = 0;
            i59 = 0;
        } else {
            c7771b = new C7771b(200, 200);
        }
        int[] iArr5 = c7771b.f42697d;
        int length3 = iArr5.length;
        for (int i60 = 0; i60 < length3; i60++) {
            iArr5[i60] = 0;
        }
        int i61 = 0;
        while (i61 < i57) {
            int i62 = i58;
            int i63 = 0;
            while (i63 < i56) {
                if (c9718b.m18220a(i63, i61) == 1) {
                    c7771b.m15478d(i62, i59, iMin, iMin);
                }
                i63++;
                i62 += iMin;
            }
            i61++;
            i59 += iMin;
        }
        return c7771b;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: k */
    public boolean mo11083k(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11603Q(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: k0 */
    public InterfaceC5246n0 mo11084k0(InterfaceC5847a interfaceC5847a) {
        return InterfaceC5436a.a.m11626g0(interfaceC5847a);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: l */
    public void mo11085l(InterfaceC5853g interfaceC5853g, InterfaceC5856j interfaceC5856j) {
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: l0 */
    public boolean mo11086l0(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        AbstractC5265x abstractC5265xMo11036C = mo11036C(interfaceC5853g);
        return (abstractC5265xMo11036C != null ? mo11060Z(abstractC5265xMo11036C) : null) != null;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: m */
    public AbstractC5265x mo11087m(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11612Z(interfaceC5850d);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: m0 */
    public boolean mo11088m0(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11598L(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: n */
    public boolean mo11089n(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11607U(interfaceC5848b);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: n0 */
    public InterfaceC5853g mo11090n0(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11642o0(this, interfaceC5852f);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2151g
    /* JADX INFO: renamed from: o */
    public void mo6367o() {
    }

    @Override // so.InterfaceC9084b
    /* JADX INFO: renamed from: o0 */
    public void mo11091o0(C9083a0 c9083a0, C9106x c9106x) {
        C5207g.m11111f(c9106x, "response");
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: p */
    public void mo6362p(InterfaceC2153i interfaceC2153i) {
        interfaceC2153i.mo6252a();
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: p0 */
    public boolean mo11092p0(InterfaceC5856j interfaceC5856j, InterfaceC5856j interfaceC5856j2) {
        return InterfaceC5436a.a.m11613a(interfaceC5856j, interfaceC5856j2);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: q */
    public AbstractC5265x mo11093q(InterfaceC5853g interfaceC5853g, CaptureStatus captureStatus) {
        return InterfaceC5436a.a.m11633k(interfaceC5853g, captureStatus);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: r */
    public boolean mo11094r(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11595I(interfaceC5856j);
    }

    /* JADX INFO: renamed from: r1 */
    public void m11095r1(InterfaceC8157a interfaceC8157a, float f3) {
        CardView.C0356a c0356a = (CardView.C0356a) interfaceC8157a;
        C8158b c8158b = (C8158b) c0356a.f1420a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f3 != c8158b.f44275e || c8158b.f44276f != useCompatPadding || c8158b.f44277g != preventCornerOverlap) {
            c8158b.f44275e = f3;
            c8158b.f44276f = useCompatPadding;
            c8158b.f44277g = preventCornerOverlap;
            c8158b.m16184c(null);
            c8158b.invalidateSelf();
        }
        m11104x1(c0356a);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: s */
    public boolean mo11096s(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11596J(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: t */
    public InterfaceC5854h mo11097t(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11617c(interfaceC5853g);
    }

    /* JADX INFO: renamed from: t0 */
    public C5247o m11098t0(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11623f(interfaceC5850d);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: u */
    public boolean mo11099u(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11594H(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: v */
    public boolean mo11100v(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11599M(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: w */
    public InterfaceC5856j mo11101w(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11636l0(this, interfaceC5852f);
    }

    /* JADX INFO: renamed from: w0 */
    public SSLContext m11102w0() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateFactory.generateCertificate(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer"))));
            trustManagerFactory.init(keyStore);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            C2181a.m6449a("SSL Context built");
            return sSLContext;
        } catch (Throwable th2) {
            if (CleverTapAPI.f10977c >= CleverTapAPI.LogLevel.INFO.intValue()) {
                Log.i("CleverTap", "Error building SSL Context", th2);
            }
            return null;
        }
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: x */
    public TypeVariance mo11103x(InterfaceC5857k interfaceC5857k) {
        return InterfaceC5436a.a.m11589C(interfaceC5857k);
    }

    /* JADX INFO: renamed from: x1 */
    public void m11104x1(InterfaceC8157a interfaceC8157a) {
        float f3;
        CardView.C0356a c0356a = (CardView.C0356a) interfaceC8157a;
        if (!CardView.this.getUseCompatPadding()) {
            c0356a.m1327a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c0356a.f1420a;
        float f10 = ((C8158b) drawable).f44275e;
        float f11 = ((C8158b) drawable).f44271a;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - C8159c.f44282a) * ((double) f11)) + ((double) f10));
        } else {
            int i10 = C8159c.f44283b;
            f3 = f10;
        }
        int iCeil = (int) Math.ceil(f3);
        int iCeil2 = (int) Math.ceil(C8159c.m16185a(f10, f11, cardView.getPreventCornerOverlap()));
        c0356a.m1327a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2152h
    /* JADX INFO: renamed from: y */
    public void mo6363y(InterfaceC2153i interfaceC2153i) {
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: z */
    public InterfaceC5855i mo11105z(InterfaceC5853g interfaceC5853g, int i10) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        if (i10 >= 0 && i10 < mo11046M(interfaceC5853g)) {
            return mo11061a(interfaceC5853g, i10);
        }
        return null;
    }

    @Override // cc.InterfaceC1967w2
    public Object zza() {
        List list = C1985y2.f10339a;
        return Long.valueOf(C2592a9.f14056b.zza().mo7715c());
    }
}
