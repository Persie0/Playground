package com.lingq.core.player.service;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.service.PlayerService", m4291f = "PlayerService.kt", m4292l = {201, 205, 207, 234, 240}, m4293m = "prepareAndPlay", m4294v = 2)
final class PlayerService$prepareAndPlay$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f22008a;

    /* JADX INFO: renamed from: b */
    public String f22009b;

    /* JADX INFO: renamed from: c */
    public ArrayList f22010c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22011d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ PlayerService f22012e;

    /* JADX INFO: renamed from: f */
    public int f22013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$prepareAndPlay$1(PlayerService playerService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22012e = playerService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22011d = obj;
        this.f22013f |= Integer.MIN_VALUE;
        return PlayerService.m8470a(this.f22012e, 0, this);
    }
}
