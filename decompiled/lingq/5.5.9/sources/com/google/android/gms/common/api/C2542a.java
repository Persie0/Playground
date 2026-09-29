package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2542a.c;
import com.google.android.gms.common.internal.InterfaceC2556b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p152hb.C6005r0;
import p152hb.InterfaceC5957c;
import p152hb.InterfaceC5980j;
import p176ib.AbstractC6251a;
import p176ib.C6254b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2542a<O extends c> {

    /* JADX INFO: renamed from: a */
    public final a<?, O> f13884a;

    /* JADX INFO: renamed from: b */
    public final f<?> f13885b;

    /* JADX INFO: renamed from: c */
    public final String f13886c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class a<T extends e, O> extends d<T, O> {
        @Deprecated
        /* JADX INFO: renamed from: b */
        public T mo4928b(Context context, Looper looper, C6254b c6254b, O o10, AbstractC2544c.a aVar, AbstractC2544c.b bVar) {
            return (T) mo4930c(context, looper, c6254b, o10, aVar, bVar);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public T mo4930c(Context context, Looper looper, C6254b c6254b, O o10, InterfaceC5957c interfaceC5957c, InterfaceC5980j interfaceC5980j) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$b */
    public static class b<C> {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c */
    public interface c {

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c$a */
        public interface a extends c {
            /* JADX INFO: renamed from: l */
            Account m7535l();
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c$b */
        public interface b extends c {
            /* JADX INFO: renamed from: a */
            GoogleSignInAccount m7536a();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d */
    public static abstract class d<T, O> {
        /* JADX INFO: renamed from: a */
        public List mo4929a(GoogleSignInOptions googleSignInOptions) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo7537a();

        /* JADX INFO: renamed from: b */
        void mo7538b(AbstractC6251a.c cVar);

        /* JADX INFO: renamed from: c */
        boolean mo7539c();

        /* JADX INFO: renamed from: d */
        Set<Scope> mo7540d();

        /* JADX INFO: renamed from: e */
        void mo7541e(InterfaceC2556b interfaceC2556b, Set<Scope> set);

        /* JADX INFO: renamed from: f */
        void mo7542f(String str);

        /* JADX INFO: renamed from: g */
        boolean mo7543g();

        /* JADX INFO: renamed from: h */
        String mo7544h();

        /* JADX INFO: renamed from: i */
        void mo7545i();

        /* JADX INFO: renamed from: j */
        void mo7546j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* JADX INFO: renamed from: k */
        boolean mo7547k();

        /* JADX INFO: renamed from: m */
        int mo7548m();

        /* JADX INFO: renamed from: n */
        Feature[] mo7549n();

        /* JADX INFO: renamed from: p */
        String mo7550p();

        /* JADX INFO: renamed from: q */
        void mo7551q(C6005r0 c6005r0);

        /* JADX INFO: renamed from: r */
        Intent mo7552r();

        /* JADX INFO: renamed from: s */
        boolean mo7553s();
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$f */
    public static final class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> C2542a(String str, a<C, O> aVar, f<C> fVar) {
        this.f13886c = str;
        this.f13884a = aVar;
        this.f13885b = fVar;
    }
}
