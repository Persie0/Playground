package p000;

import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.function.BiFunction$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ifs implements BiFunction {

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f30687g;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ifs f30686f = new ifs(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ifs f30685e = new ifs(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ifs f30684d = new ifs(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ifs f30683c = new ifs(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ifs f30682b = new ifs(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ifs f30681a = new ifs(0);

    private /* synthetic */ ifs(int i) {
        this.f30687g = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f30687g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f30687g) {
            case 0:
                igm igmVar = (igm) obj;
                igmVar.m11280q(((Integer) obj2).intValue());
                return igmVar;
            case 1:
                igm igmVar2 = (igm) obj;
                igmVar2.m11279p(((Integer) obj2).intValue());
                return igmVar2;
            case 2:
                igm igmVar3 = (igm) obj;
                igmVar3.m11283t(((Integer) obj2).intValue());
                return igmVar3;
            case 3:
                igm igmVar4 = (igm) obj;
                igmVar4.m11275l(((Integer) obj2).intValue());
                return igmVar4;
            case 4:
                obj.getClass();
                obj2.getClass();
                return new ngj(obj, obj2);
            default:
                return ngu.m17470e(obj, obj2);
        }
    }
}
