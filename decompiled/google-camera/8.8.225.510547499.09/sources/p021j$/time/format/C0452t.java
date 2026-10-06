package p021j$.time.format;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p021j$.time.C0459g;
import p021j$.time.C0461i;
import p021j$.time.C0463k;
import p021j$.time.C0468p;
import p021j$.time.C0471s;
import p021j$.time.Instant;
import p021j$.time.ZoneId;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.zone.C0493c;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.t */
/* JADX INFO: loaded from: classes3.dex */
final class C0452t extends C0451s {

    /* JADX INFO: renamed from: e */
    private static final ConcurrentHashMap f32971e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final EnumC0432C f32972c;

    /* JADX INFO: renamed from: d */
    private final boolean f32973d;

    C0452t(EnumC0432C enumC0432C, boolean z) {
        super(AbstractC0485n.m12444f(), "ZoneText(" + String.valueOf(enumC0432C) + ")");
        new HashMap();
        new HashMap();
        if (enumC0432C == null) {
            throw new NullPointerException("textStyle");
        }
        this.f32972c = enumC0432C;
        this.f32973d = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p021j$.time.format.C0451s, p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        ?? M12493h;
        String[] strArr;
        ZoneId zoneId = (ZoneId) c0455w.m12314f(AbstractC0485n.m12445g());
        if (zoneId == null) {
            return false;
        }
        String strMo12260q = zoneId.mo12260q();
        if (!(zoneId instanceof C0468p)) {
            TemporalAccessor temporalAccessorM12312d = c0455w.m12312d();
            String str = null;
            Map concurrentHashMap = null;
            if (this.f32973d) {
                M12493h = 2;
            } else if (temporalAccessorM12312d.mo12248h(EnumC0472a.INSTANT_SECONDS)) {
                M12493h = zoneId.mo12261r().m12493h(Instant.m12241q(temporalAccessorM12312d));
            } else {
                EnumC0472a enumC0472a = EnumC0472a.EPOCH_DAY;
                if (temporalAccessorM12312d.mo12248h(enumC0472a)) {
                    EnumC0472a enumC0472a2 = EnumC0472a.NANO_OF_DAY;
                    if (temporalAccessorM12312d.mo12248h(enumC0472a2)) {
                        C0461i c0461iM12347F = C0461i.m12347F(C0459g.m12323J(temporalAccessorM12312d.mo12251k(enumC0472a)), C0463k.m12371C(temporalAccessorM12312d.mo12251k(enumC0472a2)));
                        if (zoneId.mo12261r().m12491f(c0461iM12347F) == null) {
                            C0493c c0493cMo12261r = zoneId.mo12261r();
                            C0471s c0471sM12406s = C0471s.m12406s(c0461iM12347F, zoneId, null);
                            M12493h = c0493cMo12261r.m12493h(Instant.ofEpochSecond(c0471sM12406s.m12414z(), c0471sM12406s.m12411D().m12388z()));
                        } else {
                            M12493h = 2;
                        }
                    } else {
                        M12493h = 2;
                    }
                } else {
                    M12493h = 2;
                }
            }
            Locale localeM12311c = c0455w.m12311c();
            EnumC0432C enumC0432C = EnumC0432C.NARROW;
            EnumC0432C enumC0432C2 = this.f32972c;
            if (enumC0432C2 != enumC0432C) {
                ConcurrentHashMap concurrentHashMap2 = f32971e;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strMo12260q);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(localeM12311c)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strMo12260q);
                    String[] strArr2 = {strMo12260q, timeZone.getDisplayName(false, 1, localeM12311c), timeZone.getDisplayName(false, 0, localeM12311c), timeZone.getDisplayName(true, 1, localeM12311c), timeZone.getDisplayName(true, 0, localeM12311c), strMo12260q, strMo12260q};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(localeM12311c, strArr2);
                    concurrentHashMap2.put(strMo12260q, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                int iM12268a = enumC0432C2.m12268a();
                if (M12493h != 0) {
                    str = M12493h != 1 ? strArr[iM12268a + 5] : strArr[iM12268a + 3];
                } else {
                    str = strArr[iM12268a + 1];
                }
            }
            if (str != null) {
                strMo12260q = str;
            }
        }
        sb.append(strMo12260q);
        return true;
    }
}
