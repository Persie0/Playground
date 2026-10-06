package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olx extends ood implements onm {

    /* JADX INFO: renamed from: j */
    private final /* synthetic */ int f46281j;

    /* JADX INFO: renamed from: i */
    public static final olx f46280i = new olx(8);

    /* JADX INFO: renamed from: h */
    public static final olx f46279h = new olx(7);

    /* JADX INFO: renamed from: g */
    public static final olx f46278g = new olx(6);

    /* JADX INFO: renamed from: f */
    public static final olx f46277f = new olx(5);

    /* JADX INFO: renamed from: e */
    public static final olx f46276e = new olx(4);

    /* JADX INFO: renamed from: d */
    public static final olx f46275d = new olx(3);

    /* JADX INFO: renamed from: c */
    public static final olx f46274c = new olx(2);

    /* JADX INFO: renamed from: b */
    public static final olx f46273b = new olx(1);

    /* JADX INFO: renamed from: a */
    public static final olx f46272a = new olx(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olx(int i) {
        super(2);
        this.f46281j = i;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo560a(Object obj, Object obj2) {
        boolean z = true;
        switch (this.f46281j) {
            case 0:
                oly olyVar = (oly) obj;
                olv olvVar = (olv) obj2;
                olyVar.getClass();
                oly olyVarMinusKey = olyVar.minusKey(olvVar.getKey());
                if (olyVarMinusKey == olz.f46282a) {
                    return olvVar;
                }
                olu oluVar = (olu) olyVarMinusKey.get(olu.f46271a);
                if (oluVar == null) {
                    return new olr(olyVarMinusKey, olvVar);
                }
                oly olyVarMinusKey2 = olyVarMinusKey.minusKey(olu.f46271a);
                return olyVarMinusKey2 == olz.f46282a ? new olr(olvVar, oluVar) : new olr(new olr(olyVarMinusKey2, olvVar), oluVar);
            case 1:
                String str = (String) obj;
                olv olvVar2 = (olv) obj2;
                str.getClass();
                if (str.length() == 0) {
                    return olvVar2.toString();
                }
                return str + ", " + olvVar2;
            case 2:
                oly olyVar2 = (oly) obj;
                olv olvVar3 = (olv) obj2;
                olyVar2.getClass();
                return olvVar3 instanceof oqk ? olyVar2.plus(((oqk) olvVar3).m18908a()) : olyVar2.plus(olvVar3);
            case 3:
                olv olvVar4 = (olv) obj2;
                if (!((Boolean) obj).booleanValue() && !(olvVar4 instanceof oqk)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return Boolean.valueOf(ooc.m18737c(obj, obj2));
            case 5:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 6:
                olv olvVar5 = (olv) obj2;
                if (!(olvVar5 instanceof osr)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? olvVar5 : Integer.valueOf(iIntValue + 1);
            case 7:
                osr osrVar = (osr) obj;
                olv olvVar6 = (olv) obj2;
                if (osrVar != null) {
                    return osrVar;
                }
                if (olvVar6 instanceof osr) {
                    return (osr) olvVar6;
                }
                return null;
            default:
                oyg oygVar = (oyg) obj;
                olv olvVar7 = (olv) obj2;
                oygVar.getClass();
                if (olvVar7 instanceof osr) {
                    osr osrVar2 = (osr) olvVar7;
                    Object objMo18918cK = osrVar2.mo18918cK(oygVar.f46814a);
                    Object[] objArr = oygVar.f46815b;
                    int i = oygVar.f46817d;
                    objArr[i] = objMo18918cK;
                    osr[] osrVarArr = oygVar.f46816c;
                    oygVar.f46817d = i + 1;
                    osrVarArr[i] = osrVar2;
                }
                return oygVar;
        }
    }
}
