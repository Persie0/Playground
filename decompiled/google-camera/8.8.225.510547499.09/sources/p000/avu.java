package p000;

import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Constructor;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avu extends ood implements oni {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2549a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(avw avwVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = avwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(axb axbVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = axbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(CharSequence charSequence, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(Constructor constructor, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = constructor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(Consumer consumer, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = consumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(mcg mcgVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = mcgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(nps npsVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = npsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(okj okjVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = okjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(opx opxVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = opxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(oyt oytVar, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = oytVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(C1072vo c1072vo, int i) {
        super(1);
        this.f2550b = i;
        this.f2549a = c1072vo;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, ols] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object, nps] */
    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo1803a(Object obj) {
        Object objM15591r;
        Object objM15591r2;
        Object objM15591r3;
        Object objM15591r4;
        Consumer consumer = null;
        switch (this.f2550b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Consumer consumer2 = ((avw) this.f2549a).f2558c;
                if (consumer2 == null) {
                    ooc.m18736b("rearDisplaySessionConsumer");
                } else {
                    consumer = consumer2;
                }
                consumer.accept(Integer.valueOf(iIntValue));
                return oki.f46196a;
            case 1:
                ((C1072vo) this.f2549a).m19507a(0L);
                return oki.f46196a;
            case 2:
                this.f2549a.accept(Integer.valueOf(((Number) obj).intValue()));
                return oki.f46196a;
            case 3:
                WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                windowLayoutInfo.getClass();
                ((axb) this.f2549a).mo309a(windowLayoutInfo);
                return oki.f46196a;
            case 4:
                return Double.valueOf(((mcg) this.f2549a).m16309a(((Number) obj).doubleValue()));
            case 5:
                return Double.valueOf(((mcg) this.f2549a).m16309a(((Number) obj).doubleValue()));
            case 6:
                return Double.valueOf(((mcg) this.f2549a).m16309a(((Number) obj).doubleValue()));
            case 7:
                return obj == this.f2549a ? "(this Collection)" : String.valueOf(obj);
            case 8:
                String str = (String) obj;
                str.getClass();
                return ((String) this.f2549a).concat(str);
            case 9:
                oot ootVar = (oot) obj;
                ootVar.getClass();
                return ook.m18803q(this.f2549a, ootVar);
            case 10:
                this.f2549a.mo18640e(oki.f46196a);
                return oki.f46196a;
            case 11:
                this.f2549a.cancel(false);
                return oki.f46196a;
            case 12:
                Throwable th = (Throwable) obj;
                th.getClass();
                try {
                    Object objNewInstance = ((Constructor) this.f2549a).newInstance(th.getMessage(), th);
                    objNewInstance.getClass();
                    objM15591r = (Throwable) objNewInstance;
                    break;
                } catch (Throwable th2) {
                    objM15591r = lkm.m15591r(th2);
                }
                return (Throwable) (true != (objM15591r instanceof okc) ? objM15591r : null);
            case 13:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                try {
                    Object objNewInstance2 = ((Constructor) this.f2549a).newInstance(th3);
                    objNewInstance2.getClass();
                    objM15591r2 = (Throwable) objNewInstance2;
                    break;
                } catch (Throwable th4) {
                    objM15591r2 = lkm.m15591r(th4);
                }
                return (Throwable) (true != (objM15591r2 instanceof okc) ? objM15591r2 : null);
            case 14:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                try {
                    Object objNewInstance3 = ((Constructor) this.f2549a).newInstance(th5.getMessage());
                    objNewInstance3.getClass();
                    Throwable th6 = (Throwable) objNewInstance3;
                    th6.initCause(th5);
                    objM15591r3 = th6;
                    break;
                } catch (Throwable th7) {
                    objM15591r3 = lkm.m15591r(th7);
                }
                return (Throwable) (true != (objM15591r3 instanceof okc) ? objM15591r3 : null);
            case 15:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                try {
                    Object objNewInstance4 = ((Constructor) this.f2549a).newInstance(new Object[0]);
                    objNewInstance4.getClass();
                    Throwable th9 = (Throwable) objNewInstance4;
                    th9.initCause(th8);
                    objM15591r4 = th9;
                    break;
                } catch (Throwable th10) {
                    objM15591r4 = lkm.m15591r(th10);
                }
                return (Throwable) (true != (objM15591r4 instanceof okc) ? objM15591r4 : null);
            default:
                ((Throwable) obj).getClass();
                ((oyt) this.f2549a).m19208a();
                return oki.f46196a;
        }
    }
}
