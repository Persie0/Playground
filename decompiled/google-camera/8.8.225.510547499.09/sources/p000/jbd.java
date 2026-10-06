package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbd {

    /* JADX INFO: renamed from: a */
    public Set f33646a;

    /* JADX INFO: renamed from: b */
    public String f33647b;

    /* JADX INFO: renamed from: c */
    private boolean f33648c;

    /* JADX INFO: renamed from: d */
    private boolean f33649d;

    /* JADX INFO: renamed from: e */
    private boolean f33650e;

    /* JADX INFO: renamed from: f */
    private String f33651f;

    /* JADX INFO: renamed from: g */
    private Account f33652g;

    /* JADX INFO: renamed from: h */
    private String f33653h;

    /* JADX INFO: renamed from: i */
    private Map f33654i;

    public jbd() {
        this.f33646a = new HashSet();
        this.f33654i = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final GoogleSignInOptions m12830a() {
        if (this.f33646a.contains(GoogleSignInOptions.f7574e) && this.f33646a.contains(GoogleSignInOptions.f7573d)) {
            this.f33646a.remove(GoogleSignInOptions.f7573d);
        }
        if (this.f33650e && (this.f33652g == null || !this.f33646a.isEmpty())) {
            m12831b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.f33646a), this.f33652g, this.f33650e, this.f33648c, this.f33649d, this.f33651f, this.f33653h, this.f33654i, this.f33647b);
    }

    /* JADX INFO: renamed from: b */
    public final void m12831b() {
        this.f33646a.add(GoogleSignInOptions.f7572c);
    }

    /* JADX INFO: renamed from: c */
    public final void m12832c(Scope scope, Scope... scopeArr) {
        this.f33646a.add(scope);
        this.f33646a.addAll(Arrays.asList(scopeArr));
    }

    public jbd(GoogleSignInOptions googleSignInOptions) {
        this.f33646a = new HashSet();
        this.f33654i = new HashMap();
        jib.m13205j(googleSignInOptions);
        Scope scope = GoogleSignInOptions.f7570a;
        this.f33646a = new HashSet(googleSignInOptions.f7578i);
        this.f33648c = googleSignInOptions.f7581l;
        this.f33649d = googleSignInOptions.f7582m;
        this.f33650e = googleSignInOptions.f7580k;
        this.f33651f = googleSignInOptions.f7583n;
        this.f33652g = googleSignInOptions.f7579j;
        this.f33653h = googleSignInOptions.f7584o;
        this.f33654i = GoogleSignInOptions.m4637b(googleSignInOptions.f7585p);
        this.f33647b = googleSignInOptions.f7586q;
    }
}
