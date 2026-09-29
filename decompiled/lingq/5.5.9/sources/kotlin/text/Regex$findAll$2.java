package kotlin.text;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mo.InterfaceC7656d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements InterfaceC2052l<InterfaceC7656d, InterfaceC7656d> {

    /* JADX INFO: renamed from: j */
    public static final Regex$findAll$2 f39978j = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, InterfaceC7656d.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final InterfaceC7656d mo528n(InterfaceC7656d interfaceC7656d) {
        InterfaceC7656d interfaceC7656d2 = interfaceC7656d;
        C5207g.m11111f(interfaceC7656d2, "p0");
        return interfaceC7656d2.next();
    }
}
