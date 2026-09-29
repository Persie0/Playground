package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o98 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f54085a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final dr6 f54086b;

    /* JADX INFO: renamed from: c */
    public final ex3 f54087c;

    /* JADX INFO: renamed from: d */
    public final List f54088d;

    /* JADX INFO: renamed from: e */
    public final List f54089e;

    public o98(dr6 dr6Var, ex3 ex3Var, List list, List list2) {
        this.f54086b = dr6Var;
        this.f54087c = ex3Var;
        this.f54088d = list;
        this.f54089e = list2;
    }

    /* JADX INFO: renamed from: a */
    public final xl0 m17877a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f54089e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            xl0 xl0VarMo24043a = ((wl0) list.get(i)).mo24043a(type, annotationArr, this);
            if (xl0VarMo24043a != null) {
                return xl0VarMo24043a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((wl0) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final fm1 m17878b(oj0 oj0Var, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f54088d;
        int iIndexOf = list.indexOf(oj0Var) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            fm1 fm1VarMo11219b = ((em1) list.get(i)).mo11219b(type, annotationArr, this);
            if (fm1VarMo11219b != null) {
                return fm1VarMo11219b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (oj0Var != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((em1) list.get(i2)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((em1) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public final fm1 m17879c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f54088d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            fm1 fm1VarMo11218a = ((em1) list.get(i)).mo11218a(type, annotationArr, annotationArr2, this);
            if (fm1VarMo11218a != null) {
                return fm1VarMo11218a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((em1) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m17880d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f54088d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((em1) list.get(i)).getClass();
        }
    }
}
