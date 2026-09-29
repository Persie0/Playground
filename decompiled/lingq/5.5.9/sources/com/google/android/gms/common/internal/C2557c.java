package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p455wb.C9895a;
import p455wb.C9897c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2557c extends C9895a implements InterfaceC2556b {
    public C2557c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2556b
    /* JADX INFO: renamed from: c */
    public final Account mo7596c() throws RemoteException {
        Parcel parcelM18400h = m18400h(m18401j(), 2);
        Account account = (Account) C9897c.m18402a(parcelM18400h, Account.CREATOR);
        parcelM18400h.recycle();
        return account;
    }
}
