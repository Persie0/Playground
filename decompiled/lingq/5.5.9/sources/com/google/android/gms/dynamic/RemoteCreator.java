package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C2550e;
import p176ib.C6272i;
import p176ib.C6304y;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: a */
    public final String f14022a = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";

    /* JADX INFO: renamed from: b */
    public C6304y f14023b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException() {
            super("Could not get remote context.");
        }

        public RemoteCreatorException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract C6304y mo7622a(IBinder iBinder);

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public final T m7623b(Context context) throws RemoteCreatorException {
        if (this.f14023b == null) {
            C6272i.m12915i(context);
            Context remoteContext = C2550e.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException();
            }
            try {
                this.f14023b = mo7622a((IBinder) remoteContext.getClassLoader().loadClass(this.f14022a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new RemoteCreatorException("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new RemoteCreatorException("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new RemoteCreatorException("Could not instantiate creator.", e12);
            }
        }
        return (T) this.f14023b;
    }
}
