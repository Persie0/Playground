package p021j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.WatchEvent;
import java.util.Iterator;
import p021j$.nio.file.attribute.InterfaceC0338C;

/* JADX INFO: renamed from: j$.nio.file.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0392h {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0319H f32877a = new C0316E(Object.class, "OVERFLOW");

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0319H f32878b = new C0316E(Path.class, "ENTRY_CREATE");

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0319H f32879c = new C0316E(Path.class, "ENTRY_DELETE");

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0319H f32880d = new C0316E(Path.class, "ENTRY_MODIFY");

    /* JADX INFO: renamed from: a */
    public static Iterator m12203a(Path path) {
        return new C0402r(path);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC0395k m12204d() {
        return AbstractC0397m.f32883a;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ LinkOption[] m12205j(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC0319H[] m12206k(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC0319H[] interfaceC0319HArr = new InterfaceC0319H[length];
        for (int i = 0; i < length; i++) {
            interfaceC0319HArr[i] = AbstractC0335a.m12103b(kindArr[i]);
        }
        return interfaceC0319HArr;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ LinkOption[] m12207l(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = AbstractC0335a.m12105d(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ WatchEvent.Kind[] m12208m(InterfaceC0319H[] interfaceC0319HArr) {
        if (interfaceC0319HArr == null) {
            return null;
        }
        int length = interfaceC0319HArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = AbstractC0335a.m12108g(interfaceC0319HArr[i]);
        }
        return kindArr;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo12191b(String str);

    /* JADX INFO: renamed from: c */
    public abstract long mo12192c();

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC0338C mo12193e(Class cls);

    /* JADX INFO: renamed from: f */
    public abstract long mo12194f();

    /* JADX INFO: renamed from: g */
    public abstract long mo12195g();

    /* JADX INFO: renamed from: h */
    public abstract long mo12196h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo12197i();

    /* JADX INFO: renamed from: n */
    public abstract String mo12198n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo12199o(Class cls);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo12200p(String str);

    /* JADX INFO: renamed from: q */
    public abstract String mo12201q();
}
