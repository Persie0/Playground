package p021j$.desugar.sun.nio.p023fs;

import java.util.Set;
import java.util.regex.Pattern;
import p021j$.nio.file.AbstractC0395k;
import p021j$.nio.file.InterfaceC0313B;
import p021j$.nio.file.InterfaceC0331U;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.nio.file.spi.AbstractC0406c;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0295i extends AbstractC0395k {

    /* JADX INFO: renamed from: a */
    private final String f32783a;

    /* JADX INFO: renamed from: b */
    private final String f32784b;

    /* JADX INFO: renamed from: c */
    private final C0299m f32785c;

    public C0295i(C0299m c0299m, String str, String str2) {
        this.f32785c = c0299m;
        this.f32783a = str;
        this.f32784b = str2;
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: b */
    public final Iterable mo11986b() {
        throw new UnsupportedOperationException("");
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: c */
    public final Path mo11987c(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new C0301o(this, str, this.f32783a, this.f32784b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: d */
    public final InterfaceC0313B mo11988d(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            strSubstring2 = AbstractC0293g.m11983f(strSubstring2);
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new UnsupportedOperationException("Syntax '" + strSubstring + "' not recognized");
        }
        final Pattern patternCompile = Pattern.compile(strSubstring2);
        return new InterfaceC0313B() { // from class: j$.desugar.sun.nio.fs.h
            @Override // p021j$.nio.file.InterfaceC0313B
            /* JADX INFO: renamed from: a */
            public final boolean mo11985a(Path path) {
                return patternCompile.matcher(path.toString()).matches();
            }
        };
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: e */
    public final Iterable mo11989e() {
        return AbstractC0293g.m11979b(new Object[]{new C0301o(this, "/", this.f32783a, this.f32784b)});
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: f */
    public final String mo11990f() {
        return "/";
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: g */
    public final AbstractC0359Y mo11991g() {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: h */
    public final boolean mo11992h() {
        return false;
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: i */
    public final InterfaceC0331U mo11993i() {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.nio.file.AbstractC0395k
    public final boolean isOpen() {
        return true;
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: j */
    public final AbstractC0406c mo11994j() {
        return this.f32785c;
    }

    @Override // p021j$.nio.file.AbstractC0395k
    /* JADX INFO: renamed from: k */
    public final Set mo11995k() {
        return AbstractC0293g.m11980c(new Object[]{"basic"});
    }
}
