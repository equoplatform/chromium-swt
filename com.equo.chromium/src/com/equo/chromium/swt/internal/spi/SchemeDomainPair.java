/****************************************************************************
**
** Copyright (C) 2024 Equo
**
** This file is part of Equo Chromium.
**
** Commercial License Usage
** Licensees holding valid commercial Equo licenses may use this file in
** accordance with the commercial license agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and Equo. For licensing terms
** and conditions see https://www.equo.dev/terms.
**
** GNU General Public License Usage
** Alternatively, this file may be used under the terms of the GNU
** General Public License version 3 as published by the Free Software
** Foundation. Please review the following
** information to ensure the GNU General Public License requirements will
** be met: https://www.gnu.org/licenses/gpl-3.0.html.
**
****************************************************************************/


package com.equo.chromium.swt.internal.spi;

public class SchemeDomainPair {

	private String scheme;
	private String domain;

	private SchemeDomainPair(String scheme, String domain) {
		this.scheme = scheme;
		this.domain = domain;
	}

	public static SchemeDomainPair of(String scheme, String domain) {
		return new SchemeDomainPair(scheme, domain);
	}

	public String getScheme() {
		return scheme;
	}

	public String getDomain() {
		return domain;
	}

}